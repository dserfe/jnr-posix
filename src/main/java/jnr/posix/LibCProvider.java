
package jnr.posix;

public interface LibCProvider {
    public LibC getLibC();
    public Crypt getCrypt();
}
