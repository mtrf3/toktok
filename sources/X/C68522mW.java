package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.CheckInfringementResponse;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.LongAudioCopyrightDetectAPI;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.EditLongVideoAudioCopyrightController$showAuthorizeDialogIfNeed$1", f = "EditLongVideoAudioCopyrightController.kt", l = {71}, m = "invokeSuspend")
/* renamed from: X.2mW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68522mW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C6EK LJLILLLLZI;
    public final /* synthetic */ FragmentManager LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68522mW(C6EK c6ek, FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC67352kd<? super C68522mW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c6ek;
        this.LJLJI = fragmentManager;
        this.LJLJJI = context;
        this.LJLJJL = videoPublishEditModel;
        this.LJLJJLL = i;
        this.LJLJL = interfaceC65784Pro;
        this.LJLJLJ = interfaceC65784Pro2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68522mW(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            try {
                CheckInfringementResponse checkInfringementResponse = ((LongAudioCopyrightDetectAPI.Api) new LongAudioCopyrightDetectAPI().LIZ.getValue()).checkInfringement().execute().LIZIZ;
                if (checkInfringementResponse != null && o.LJ(checkInfringementResponse.isInfringement(), Boolean.TRUE)) {
                    AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                    C6EM c6em = new C6EM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, null);
                    this.LJLIL = 1;
                    if (XKX.LJI(abstractC78621UtN, c6em, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            } catch (Exception unused) {
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
