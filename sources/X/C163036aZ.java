package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.QuickForwardResRestoreTask$execute$1$1", f = "QuickForwardResRestoreTask.kt", l = {66}, m = "invokeSuspend")
/* renamed from: X.6aZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163036aZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C67996QmO LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C163036aZ(VideoPublishEditModel videoPublishEditModel, String str, C67996QmO c67996QmO, InterfaceC67352kd<? super C163036aZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = str;
        this.LJLJJI = c67996QmO;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C163036aZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC41417GNh LIZJ = C60903NvH.LJIIJJI().LJJJI().LIZJ();
            CreativeInfo creativeInfo = this.LJLILLLLZI.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
            AwemeDraft LJ = LIZJ.LJ(new C41363GLf(creativeInfo, false));
            if (LJ == null) {
                return C76800UCe.LIZ;
            }
            LJ.LJJJJI.canvasVideoData = this.LJLILLLLZI.canvasVideoData;
            LJ.LJIIJ = this.LJLJI;
            String str = LJ.LIZ.nleInfoModel.nleDataPath;
            if (C78685UuP.LJJJZ(str) && str != null) {
                String str2 = this.LJLJI;
                File file = new File(str);
                if (file.exists()) {
                    C16880lQ.LLLZZIL(file);
                }
                V1M.LJJL(str, str2);
            }
            InterfaceC41392GMi LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF();
            NDG ndg = new NDG(LJ, new GLI("CloudMerge", 0, 2));
            this.LJLIL = 1;
            if (LJFF.LIZLLL(ndg, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJJI.LIZIZ(new C43393H1h("QuickForwardResRestoreTask", "update draft success"), EnumC43531H6p.OUTER);
        return C76800UCe.LIZ;
    }
}
