package X;

import Y.AfS64S0100000_12;
import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.CommentFilterDislikeControl;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.CommentFilterModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SKw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71930SKw implements SHK {
    public static final C71930SKw LIZ = new C71930SKw();

    @Override // X.SHK
    public final List<SLJ> LIZ(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, Parcelable parcelable, SKL skl) {
        SLJ sla;
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        CommentFilterModel commentFilterModel = (CommentFilterModel) new ViewModelProvider(viewModelStoreOwner).get(CommentFilterModel.class);
        commentFilterModel.getClass();
        SLF.LIZ().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(commentFilterModel, 127), new InterfaceC64592gB() { // from class: X.9EO
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        if (!(lifecycleOwner instanceof Fragment)) {
            return C61878OQg.INSTANCE;
        }
        Fragment fragment = (Fragment) lifecycleOwner;
        fragment.requireFragmentManager().LJJLIL(new C71928SKu(commentFilterModel), false);
        SLJ[] sljArr = new SLJ[6];
        sljArr[0] = new SHV(fragment);
        sljArr[1] = new SKC(context);
        commentFilterModel.LJLJI.mv0(skl);
        sljArr[2] = new SL1(commentFilterModel, fragment);
        if (CommentFilterDislikeControl.isNewVersion()) {
            sla = new C71932SKy(commentFilterModel, fragment);
        } else {
            commentFilterModel.LJLJJI.mv0(skl);
            sla = new SLA(commentFilterModel, context, lifecycleOwner, skl);
        }
        sljArr[3] = sla;
        sljArr[4] = new C71927SKt(commentFilterModel, fragment);
        sljArr[5] = new C71931SKx(commentFilterModel, fragment);
        return C47261Igj.LJJIJIIJI(sljArr);
    }
}
