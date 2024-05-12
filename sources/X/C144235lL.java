package X;

import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.topbar.Video2StickerTopBarComponent$nextAction$1", f = "Video2StickerTopBarComponent.kt", l = {119}, m = "invokeSuspend")
/* renamed from: X.5lL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144235lL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C144245lM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144235lL(C144245lM c144245lM, InterfaceC67352kd<? super C144235lL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c144245lM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C144235lL c144235lL = new C144235lL(this.LJLJI, interfaceC67352kd);
        c144235lL.LJLILLLLZI = obj;
        return c144235lL;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC79150V4o LIZLLL;
        int i;
        long j;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                LIZLLL = (InterfaceC79150V4o) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            LIZLLL = XKX.LIZLLL((InterfaceC70422pa) this.LJLILLLLZI, null, null, new C144255lN(this.LJLJI, null), 3);
            this.LJLILLLLZI = LIZLLL;
            this.LJLIL = 1;
            if (C1JD.LIZJ(60000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (LIZLLL.isCompleted() || LIZLLL.isCancelled()) {
            return C76800UCe.LIZ;
        }
        LIZLLL.LIZIZ(null);
        C144245lM c144245lM = this.LJLJI;
        C144265lO c144265lO = c144245lM.LJZI;
        if (c144265lO != null && c144265lO.LIZJ != -1 && c144265lO.LJFF == 0) {
            String str = c144245lM.LLIIIL().originVideoInfo.awemeId;
            String str2 = this.LJLJI.LLIIIL().originVideoInfo.userId;
            boolean LJJI = C1A7.LJJI(this.LJLJI.LLIIIL());
            boolean z = !this.LJLJI.LLIILZL().W50().isEmpty();
            Video2StickerModel LLIIIL = this.LJLJI.LLIIIL();
            o.LJIIIZ(LLIIIL, "<this>");
            VideoTimeTrimData videoTimeTrimData = LLIIIL.videoTimeTrimData;
            if (videoTimeTrimData.isSingleFrame) {
                j = 0;
            } else {
                j = videoTimeTrimData.endTime - videoTimeTrimData.startTime;
            }
            C6GK.LIZIZ(j, str, str2, z, LJJI, false);
        }
        this.LJLJI.LLFFF().dismiss();
        C144265lO c144265lO2 = this.LJLJI.LJZI;
        if (c144265lO2 != null) {
            if (c144265lO2.LJFF == 0) {
                i = 1;
            } else if (c144265lO2.LJI == 0) {
                i = 2;
            } else {
                throw new IllegalArgumentException();
            }
            C144265lO.LIZIZ(c144265lO2, 2, i, 0, "", 16);
        }
        ActivityC45651qj activity = this.LJLJI.getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        String string = this.LJLJI.getActivity().getString(R.string.tlp);
        o.LJIIIIZZ(string, "activity.getString(R.str…Page_creationError_toast)");
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIIZI(activity, 1033, creativeToastBuilder);
        this.LJLJI.LJZI = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
