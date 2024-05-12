package X;

/* loaded from: classes15.dex */
public final class W8P {
    public static int LIZ;
    public static W86 sImpl;
    public static boolean sImplLoaded;

    public static W86 LIZ(AbstractC78853Ux7 abstractC78853Ux7, W87 w87, W6X<W6U, W5A> w6x) {
        if (!sImplLoaded) {
            try {
                sImpl = (W86) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(AbstractC78853Ux7.class, W87.class, W6X.class).newInstance(abstractC78853Ux7, w87, w6x);
            } catch (Throwable unused) {
            }
            if (sImpl != null) {
                sImplLoaded = true;
            }
        }
        return sImpl;
    }
}
