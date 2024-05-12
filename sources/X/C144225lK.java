package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.topbar.Video2StickerTopBarComponent$nextTask$2", f = "Video2StickerTopBarComponent.kt", l = {173}, m = "invokeSuspend")
/* renamed from: X.5lK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144225lK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C144245lM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144225lK(C144245lM c144245lM, InterfaceC67352kd<? super C144225lK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c144245lM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C144225lK(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            if (this.LJLILLLLZI.LJZI != null) {
                C60903NvH.LJIIJJI().LJJIIJ();
            }
            this.LJLILLLLZI.LJZI = new C144265lO(this.LJLILLLLZI.LLIIIL().videoTimeTrimData.isSingleFrame ? 1 : 0);
            C144265lO c144265lO = this.LJLILLLLZI.LJZI;
            if (c144265lO != null) {
                c144265lO.LIZIZ = System.currentTimeMillis();
            }
            DialogC25756A8y LLFFF = this.LJLILLLLZI.LLFFF();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", LLFFF, new Object[0], "void", new C65300Pk0(false, "()V", "8518482880370804824")).LIZ) {
                LLFFF.show();
            }
            XIA xia = C78613UtF.LIZJ;
            C144205lI c144205lI = new C144205lI(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            obj2 = XKX.LJI(xia, c144205lI, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C144285lQ c144285lQ = (C144285lQ) obj2;
        C144265lO c144265lO2 = this.LJLILLLLZI.LJZI;
        if (c144265lO2 != null) {
            c144265lO2.LJI = System.currentTimeMillis() - c144265lO2.LIZLLL;
            C144265lO.LIZIZ(c144265lO2, 0, 0, null, null, 28);
        }
        C144245lM c144245lM = this.LJLILLLLZI;
        c144245lM.LJZI = null;
        c144245lM.LLFFF().dismiss();
        if (c144285lQ != null) {
            this.LJLILLLLZI.LLIIZ(c144285lQ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
