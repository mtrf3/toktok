package X;

import Y.AfS61S0200000_12;
import Y.AfS64S0100000_12;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.CommentFilterModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.api.CommentFilterApi;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.keywords.KeyWordsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.SKu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71928SKu extends C08Z {
    public final /* synthetic */ CommentFilterModel LIZ;

    public C71928SKu(CommentFilterModel commentFilterModel) {
        this.LIZ = commentFilterModel;
    }

    @Override // X.C08Z
    public final void onFragmentDetached(FragmentManager fm, Fragment f) {
        String str;
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        KeyWordsViewModel keyWordsViewModel = this.LIZ.LJLILLLLZI;
        if (keyWordsViewModel.LJLJL && keyWordsViewModel.LJLJJLL) {
            List<String> list = keyWordsViewModel.LJLJJI;
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                if (true ^ o.LJ(s.LLD(str2).toString(), "")) {
                    arrayList.add(str2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(s.LJZI((String) it.next()).toString());
            }
            CommentFilterApi.LIZ.setCommentFilterKeywords(GsonProtectorUtils.toJson(new Gson(), arrayList2)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0200000_12(keyWordsViewModel, arrayList2, 14), new AfS64S0100000_12(keyWordsViewModel, UserLevelGeckoUpdateSetting.DEFAULT));
            if (arrayList2.isEmpty()) {
                keyWordsViewModel.LJLILLLLZI.setValue(2);
                C63024OoO.LIZJ(2);
            }
            Integer value = keyWordsViewModel.LJLILLLLZI.getValue();
            if (value == null) {
                value = 2;
            }
            int intValue = value.intValue();
            int i = keyWordsViewModel.LJLJI;
            if (intValue == 1) {
                str = "filter_on";
            } else {
                str = "filter_off";
            }
            if (intValue != i) {
                FMX.LJIIL(str, new C188727au().LIZ);
            }
        }
        super.onFragmentDetached(fm, f);
    }
}
