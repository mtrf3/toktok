package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;

/* renamed from: X.JsP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC50533JsP implements View.OnTouchListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJI;
    public final /* synthetic */ java.util.Map<String, Boolean> LJLJJL;
    public final /* synthetic */ SearchSugWordResponse LJLJJLL;

    public ViewOnTouchListenerC50533JsP(String str, C72242sW c72242sW, View view, java.util.Map<String, String> map, java.util.Map<String, Boolean> map2, SearchSugWordResponse searchSugWordResponse) {
        this.LJLIL = str;
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = view;
        this.LJLJJI = map;
        this.LJLJJL = map2;
        this.LJLJJLL = searchSugWordResponse;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (!TextUtils.isEmpty(this.LJLIL) && motionEvent.getAction() == 0) {
            this.LJLILLLLZI.element = System.currentTimeMillis();
            Z9N z9n = Z9N.LIZIZ;
            Context context = this.LJLJI.getContext();
            DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
            java.util.Map<String, String> map = this.LJLJJI;
            java.util.Map<String, Boolean> map2 = this.LJLJJL;
            String str = this.LJLIL;
            SearchSugWordResponse searchSugWordResponse = this.LJLJJLL;
            detailFeedSearchHelper.getClass();
            z9n.LLLLLLIL(context, DetailFeedSearchHelper.LJFF(map, map2, str, searchSugWordResponse));
        } else if (!TextUtils.isEmpty(this.LJLIL)) {
            boolean z2 = true;
            if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
                int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                DetailFeedSearchHelper.LJLIL.getClass();
                float f = -scaledTouchSlop;
                if (x >= f && y >= f && x < (view.getRight() - view.getLeft()) + scaledTouchSlop && y < (view.getBottom() - view.getTop()) + scaledTouchSlop) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Z9N.LIZIZ.LIZ.LLLIIII(this.LJLILLLLZI.element, "default_search_keyword_outside", true);
                } else {
                    if (motionEvent.getAction() != 3) {
                        z2 = false;
                    }
                    Z9N.LIZIZ.LIZ.LLLIIII(this.LJLILLLLZI.element, "default_search_keyword_outside", z2);
                }
            }
        }
        return false;
    }
}
