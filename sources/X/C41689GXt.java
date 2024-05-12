package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createPrepareTaskFlow$1$1", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GXt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41689GXt extends AbstractC65782Prm implements InterfaceC88473Ynt<GYE, C163166am, InterfaceC67352kd<? super OSZ<? extends GYE, ? extends C163166am>>, Object> {
    public /* synthetic */ GYE LJLIL;
    public /* synthetic */ C163166am LJLILLLLZI;

    public C41689GXt(InterfaceC67352kd<? super C41689GXt> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return new OSZ(this.LJLIL, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(GYE gye, C163166am c163166am, InterfaceC67352kd<? super OSZ<? extends GYE, ? extends C163166am>> interfaceC67352kd) {
        C41689GXt c41689GXt = new C41689GXt(interfaceC67352kd);
        c41689GXt.LJLIL = gye;
        c41689GXt.LJLILLLLZI = c163166am;
        return c41689GXt.invokeSuspend(C76800UCe.LIZ);
    }
}
