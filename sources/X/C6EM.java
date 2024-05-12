package X;

import Y.ACListenerS37S0200000_2;
import Y.IDCListenerS278S0100000_2;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import fjb.a;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.EditLongVideoAudioCopyrightController$showAuthorizeDialogIfNeed$1$1", f = "EditLongVideoAudioCopyrightController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6EM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6EM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C6EK LJLIL;
    public final /* synthetic */ FragmentManager LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6EM(C6EK c6ek, FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC67352kd<? super C6EM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c6ek;
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = context;
        this.LJLJJI = videoPublishEditModel;
        this.LJLJJL = i;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = interfaceC65784Pro2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6EM(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C6EK c6ek = this.LJLIL;
        FragmentManager supportFragmentManager = this.LJLILLLLZI;
        Context context = this.LJLJI;
        VideoPublishEditModel videoPublishEditModel = this.LJLJJI;
        int i = this.LJLJJL;
        InterfaceC65784Pro<C76800UCe> closeBlock = this.LJLJJLL;
        InterfaceC65784Pro<C76800UCe> block = this.LJLJL;
        c6ek.getClass();
        Object value = C6EV.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        ((Keva) value).storeBoolean("show_authorize", true);
        o.LJIIIZ(supportFragmentManager, "supportFragmentManager");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(closeBlock, "closeBlock");
        o.LJIIIZ(block, "block");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.am6, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…rize_layout, null, false)");
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS149S0200000_2(LLLLIILL, closeBlock, 30));
        c235119Kp.LIZIZ(LIZJ);
        SY4 sy4 = (SY4) LLLLIILL.findViewById(R.id.axr);
        if (sy4 != null) {
            if (C58B.LIZ()) {
                sy4.setButtonVariant(0);
            }
            C16880lQ.LJJIZ(sy4, new ACListenerS37S0200000_2(block, LLLLIILL, 3));
        }
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLLI = LLLLIILL;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLJ = true;
        tuxSheet2.LJLIL = new IDCListenerS278S0100000_2(LLLLIILL, 0);
        tuxSheet2.show(supportFragmentManager, "showAuthorizeDialog");
        String creationId = videoPublishEditModel.getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        String str = videoPublishEditModel.mShootWay;
        o.LJIIIIZZ(str, "model.mShootWay");
        C6ES.LJFF(creationId, str, String.valueOf(videoPublishEditModel.draftId), H7R.LJIIIZ(videoPublishEditModel), H7R.LJIIIIZZ(videoPublishEditModel), c6ek.LIZ(), videoPublishEditModel.getMusicId(), i, C78983UzD.LJJJJJL(videoPublishEditModel) ? 1 : 0);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
