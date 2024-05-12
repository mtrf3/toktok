package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.NSw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59398NSw extends AbstractViewOnClickListenerC59394NSs {
    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZJ() {
        String[] appCategory;
        AwemeRawAd awemeRawAd = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd != null && (appCategory = awemeRawAd.getAppCategory()) != null) {
            View findViewById = LIZ(R.layout.bju, this.LJLIL).findViewById(R.id.uc);
            o.LJIIIIZZ(findViewById, "normalLayout.findViewById(R.id.ad_tag_layout)");
            C5LA c5la = (C5LA) findViewById;
            if (appCategory.length == 0) {
                c5la.setVisibility(8);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str : appCategory) {
                    if (str.length() <= 6) {
                        arrayList.add(str);
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                o.LJIIIIZZ(array, "strings.toArray(arrayOf<String>())");
                c5la.setTagList((String[]) array);
            }
            c5la.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        }
    }

    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZLLL(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null || valueOf.intValue() != R.id.uc) {
            return;
        }
        this.LJLJJI.LIZ(15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59398NSw(LinearLayout feedAdLayout, NQD nqd) {
        super(feedAdLayout, nqd);
        o.LJIIIZ(feedAdLayout, "feedAdLayout");
    }
}
