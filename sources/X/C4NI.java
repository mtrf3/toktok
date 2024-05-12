package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4NI, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4NI extends TBS implements InterfaceC65784Pro<C108474Nn> {
    public C4NI(Object obj) {
        super(0, obj, C4NG.class, "createShareTextBoxComponent", "createShareTextBoxComponent()Lcom/ss/android/ugc/aweme/im/sdk/share/ui/textbox/ShareTextBoxLayoutComponent;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C108474Nn invoke() {
        C4NG c4ng = (C4NG) this.receiver;
        c4ng.getClass();
        C25600zU LJIIIIZZ = C78605Ut7.LJIIIIZZ(c4ng.LJLJLLL);
        ShareDialogViewModel dialogViewModel = c4ng.LLIIIZ;
        C4NQ c4nq = c4ng.LJLLILLLL;
        SharePackage sharePackage = c4ng.LJLLL;
        BaseContent baseContent = c4ng.LJLLLL;
        java.util.Map<String, String> map = c4ng.LJLLLLLL;
        java.util.Map<String, String> map2 = c4ng.LJLZ;
        java.util.Set<IMContact> set = c4ng.LJLL;
        boolean z = c4ng.LJLLJ;
        boolean z2 = c4ng.LJLLI;
        ActivityC45651qj lifecycleOwner = c4ng.LLIIII;
        View LJJIFFI = c4ng.LJJIFFI();
        o.LJI(LJJIFFI);
        boolean z3 = c4ng.LJZL;
        boolean z4 = c4ng.LLD;
        o.LJIIIZ(dialogViewModel, "dialogViewModel");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        MutableLiveData<Boolean> mutableLiveData = dialogViewModel.LJLLILLLL;
        LinearLayout linearLayout = (LinearLayout) LJJIFFI.findViewById(R.id.dys);
        o.LJIIIIZZ(linearLayout, "layout.group_chat_hint");
        C71897SJp c71897SJp = (C71897SJp) LJJIFFI.findViewById(R.id.b_o);
        o.LJIIIIZZ(c71897SJp, "layout.checkbox");
        ShareTextBoxViewModel shareTextBoxViewModel = new ShareTextBoxViewModel(sharePackage, c4nq, c4ng, mutableLiveData, new C108434Nj(linearLayout, c71897SJp, (SY4) LJJIFFI.findViewById(R.id.byv)), z, z3, z4);
        return new C108474Nn(LJJIFFI, shareTextBoxViewModel, set, z2, new C108464Nm(LJIIIIZZ, LJJIFFI, sharePackage, baseContent, map, map2, shareTextBoxViewModel, lifecycleOwner));
    }
}
