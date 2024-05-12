package X;

import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.duetupload.DuetUploadModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.duet.DuetUploadChosenResultImpl$onChosenResult$1", f = "DuetUploadChosenResultImpl.kt", l = {107}, m = "invokeSuspend")
/* renamed from: X.Gf8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42066Gf8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ShortVideoContext LJLILLLLZI;
    public final /* synthetic */ ArrayList<MediaModel> LJLJI;
    public final /* synthetic */ Intent LJLJJI;
    public final /* synthetic */ DuetUploadModel LJLJJL;
    public final /* synthetic */ H9U LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42066Gf8(ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, Intent intent, DuetUploadModel duetUploadModel, H9U h9u, InterfaceC67352kd<? super C42066Gf8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = arrayList;
        this.LJLJJI = intent;
        this.LJLJJL = duetUploadModel;
        this.LJLJJLL = h9u;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42066Gf8(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
            CreativeInfo creativeInfo = this.LJLILLLLZI.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
            List LJJIJIL = C47261Igj.LJJIJIL(((MediaModel) ListProtector.get(this.LJLJI, 0)).fileLocalUriPath);
            c43117Gw5.getClass();
            List LJIIJ = C43117Gw5.LJIIJ(creativeInfo, LJJIJIL);
            if (LJIIJ != null && LJIIJ.size() == 1) {
                MediaModel clone = ((MediaModel) ListProtector.get(this.LJLJI, 0)).clone();
                clone.fileLocalUriPath = (String) ListProtector.get(LJIIJ, 0);
                clone.type = 1;
                clone.mimeType = "image/png";
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                arrayList.add(clone);
                this.LJLJJI.putParcelableArrayListExtra("key_choose_media_data", arrayList);
                this.LJLJJL.fileLocalUriPath = (String) ListProtector.get(LJIIJ, 0);
                DuetUploadModel duetUploadModel = this.LJLJJL;
                duetUploadModel.isImageType = true;
                duetUploadModel.isVideoType = false;
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C42067Gf9 c42067Gf9 = new C42067Gf9(this.LJLJJLL, this.LJLJJI, null);
                this.LJLIL = 1;
                if (XKX.LJI(abstractC78621UtN, c42067Gf9, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                this.LJLJJLL.LJ(this.LJLJJI);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
