package X;

/* renamed from: X.Yn6, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC88424Yn6 implements InterfaceC79900VXk {
    public final int[] LIZ;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC88419Yn1 LIZIZ;

    public AbstractC88424Yn6(TextureViewSurfaceTextureListenerC88419Yn1 textureViewSurfaceTextureListenerC88419Yn1, int[] iArr) {
        this.LIZIZ = textureViewSurfaceTextureListenerC88419Yn1;
        if (textureViewSurfaceTextureListenerC88419Yn1.LJLL == 2) {
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            iArr = iArr2;
        }
        this.LIZ = iArr;
    }
}
