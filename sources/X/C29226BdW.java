package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BdW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29226BdW extends AbstractC29229BdZ {
    public final List<FeedBanner> LJLJJLL;
    public final String LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<FeedBanner> list = this.LJLJJLL;
        if (list == null) {
            return 0;
        }
        if (((ArrayList) list).size() > 1) {
            return Integer.MAX_VALUE;
        }
        return ((ArrayList) this.LJLJJLL).size();
    }

    public final FeedBanner LJJIIJZLJL(int i) {
        List<FeedBanner> list = this.LJLJJLL;
        if (list == null || ((ArrayList) list).isEmpty() || i < 0) {
            return null;
        }
        return (FeedBanner) ListProtector.get(this.LJLJJLL, i % ((ArrayList) this.LJLJJLL).size());
    }

    public C29226BdW(Context context, LayoutInflater layoutInflater, String str) {
        super(context, layoutInflater, 0);
        this.LJLJJLL = new ArrayList();
        this.LJLJL = str;
    }

    @Override // X.AbstractC29229BdZ, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        if (obj == null) {
            return;
        }
        View view = (View) obj;
        C16880lQ.LJLLL(view, viewGroup);
        if (this.LJLJI.size() < ((ArrayList) this.LJLJJLL).size()) {
            this.LJLJI.add(view);
        }
    }

    @Override // X.AbstractC29229BdZ
    public final View LJJIII(int i, View view, ViewGroup viewGroup) {
        C29227BdX c29227BdX;
        if (view == null) {
            view = C16880lQ.LLLLIILL(this.LJLJJI, R.layout.d6p, viewGroup, false);
            c29227BdX = new C29227BdX(i % ((ArrayList) this.LJLJJLL).size(), viewGroup.getContext(), view, this.LJLJL);
            view.setTag(c29227BdX);
        } else {
            c29227BdX = (C29227BdX) view.getTag();
        }
        List<FeedBanner> list = this.LJLJJLL;
        if (list != null && !((ArrayList) list).isEmpty()) {
            List<FeedBanner> list2 = this.LJLJJLL;
            FeedBanner feedBanner = (FeedBanner) ListProtector.get(list2, i % ((ArrayList) list2).size());
            c29227BdX.LJ = feedBanner;
            if (feedBanner != null) {
                c29227BdX.LIZJ.setVisibility(8);
                String str = feedBanner.text;
                if (feedBanner.LIZIZ() != null && feedBanner.LIZIZ().getUrls() != null && feedBanner.LIZIZ().getUrls().size() > 0) {
                    c29227BdX.LIZ.setImageURI((String) ListProtector.get(feedBanner.LIZIZ().getUrls(), 0));
                }
                if (TextUtils.isEmpty(str)) {
                    c29227BdX.LIZIZ.setVisibility(8);
                } else {
                    c29227BdX.LIZIZ.setVisibility(0);
                    c29227BdX.LIZIZ.setText(str);
                }
            }
        }
        return view;
    }
}
