package X;

import Y.ACListenerS35S0300000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LV6 extends AbstractC54946LhO {
    public TuxTextView LJLJJI;
    public SmartImageView LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxIconView LJLJL;
    public View LJLJLJ;

    @Override // X.AbstractC54946LhO
    public final String LIZIZ() {
        return "anchor";
    }

    @Override // X.AbstractC54946LhO
    public final void LJ(DataCenter dataCenter) {
    }

    @Override // X.AbstractC54946LhO
    public final void LJFF() {
    }

    public LV6(View view) {
        super(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // X.AbstractC54946LhO
    public final void LIZ(LV8 lv8) {
        Aweme aweme;
        ?? r3;
        FragmentManager fragmentManager;
        UrlModel urlModel;
        Context context;
        Fragment fragment;
        List<AnchorCommonStruct> anchors;
        List<AnchorPanelAction> actions;
        super.LIZ(lv8);
        String str = null;
        if (lv8 != null) {
            aweme = lv8.LIZ;
        } else {
            aweme = null;
        }
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            r3 = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                AnchorCommonStruct it = anchorCommonStruct;
                o.LJIIIIZZ(it, "it");
                if (it.getType() == 28 && (actions = it.getActions()) != null) {
                    Iterator<AnchorPanelAction> it2 = actions.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AnchorPanelAction next = it2.next();
                            if (next.getActionType() == 1) {
                                if (next != null) {
                                    r3.add(anchorCommonStruct);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            r3 = C61878OQg.INSTANCE;
        }
        if (r3.isEmpty()) {
            return;
        }
        if (lv8 != null && (fragment = lv8.LIZIZ) != null) {
            fragmentManager = fragment.getFragmentManager();
        } else {
            fragmentManager = null;
        }
        View view = this.LJLJLJ;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS35S0300000_9(this, r3, fragmentManager, 1), view);
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(r3, 0);
        if (anchorCommonStruct2 != null) {
            urlModel = anchorCommonStruct2.getIcon();
        } else {
            urlModel = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJJIIJ = this.LJLJJL;
        C16880lQ.LLJJJ(LJII);
        if (r3.size() == 1) {
            TuxTextView tuxTextView = this.LJLJJI;
            if (tuxTextView != null) {
                String keyword = ((AnchorCommonStruct) ListProtector.get(r3, 0)).getKeyword();
                if (keyword == null) {
                    keyword = "";
                }
                tuxTextView.setText(keyword);
            }
            TuxIconView tuxIconView = this.LJLJL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TuxTextView tuxTextView2 = this.LJLJJLL;
            if (tuxTextView2 == null) {
                return;
            }
            tuxTextView2.setText("");
            return;
        }
        TuxTextView tuxTextView3 = this.LJLJJI;
        if (tuxTextView3 != null) {
            View view2 = this.LJLIL;
            if (view2 != null && (context = view2.getContext()) != null) {
                str = context.getString(R.string.hnr);
            }
            tuxTextView3.setText(str);
        }
        TuxIconView tuxIconView2 = this.LJLJL;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(0);
        }
        TuxTextView tuxTextView4 = this.LJLJJLL;
        if (tuxTextView4 == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("({");
        LIZ.append(r3.size());
        LIZ.append("})");
        tuxTextView4.setText(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC54946LhO
    public final void LIZJ(View view) {
        TuxTextView tuxTextView;
        SmartImageView smartImageView;
        TuxTextView tuxTextView2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            TuxIconView tuxIconView = null;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bfl, C16880lQ.LLZIL(viewGroup.getContext()), null);
            this.LJLJLJ = LLLZIIL;
            if (LLLZIIL != null) {
                tuxTextView = (TuxTextView) LLLZIIL.findViewById(R.id.fek);
            } else {
                tuxTextView = null;
            }
            this.LJLJJI = tuxTextView;
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                smartImageView = (SmartImageView) view2.findViewById(R.id.fei);
            } else {
                smartImageView = null;
            }
            this.LJLJJL = smartImageView;
            View view3 = this.LJLJLJ;
            if (view3 != null) {
                tuxTextView2 = (TuxTextView) view3.findViewById(R.id.fel);
            } else {
                tuxTextView2 = null;
            }
            this.LJLJJLL = tuxTextView2;
            View view4 = this.LJLJLJ;
            if (view4 != null) {
                tuxIconView = (TuxIconView) view4.findViewById(R.id.fej);
            }
            this.LJLJL = tuxIconView;
            viewGroup.addView(this.LJLJLJ);
        }
    }
}
