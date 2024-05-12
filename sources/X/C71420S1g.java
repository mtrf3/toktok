package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.S1g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71420S1g implements InterfaceC71425S1l {
    public final String LIZ;
    public ViewGroup LIZIZ;
    public TuxTextView LIZJ;
    public View LIZLLL;
    public TuxTextView LJ;
    public ViewGroup LJFF;
    public TuxTextView LJI;
    public View LJII;
    public TuxTextView LJIIIIZZ;
    public View LJIIIZ;
    public PoiDataStruct LJIIJ;

    @Override // X.InterfaceC71425S1l
    public final boolean LIZ(C71419S1f anchor) {
        o.LJIIIZ(anchor, "anchor");
        return true;
    }

    public C71420S1g(String str) {
        this.LIZ = str;
    }

    public static void LIZJ(TuxTextView tuxTextView, String str) {
        if (str != null && (!TextUtils.isEmpty(str))) {
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setText(str);
            tuxTextView.setVisibility(0);
            return;
        }
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setVisibility(8);
    }

    @Override // X.InterfaceC71425S1l
    public final void LIZIZ(Aweme aweme, C71419S1f anchor, S1U poiAnchorMaker) {
        String str;
        String str2;
        String str3;
        TuxTextView tuxTextView;
        String LIZ;
        String str4;
        PoiAnchorInfo commentAnchor;
        CharSequence text;
        PoiAnchorInfo commentAnchor2;
        List<PoiSubTag> subTags;
        PoiAnchorInfo commentAnchor3;
        List<PoiSubTag> subTags2;
        Object next;
        String str5;
        String str6;
        CharSequence text2;
        CharSequence text3;
        CharSequence text4;
        PoiAnchorInfo commentAnchor4;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(poiAnchorMaker, "poiAnchorMaker");
        this.LJIIJ = aweme.getPoiDataStruct();
        this.LIZIZ = (ViewGroup) anchor.findViewById(R.id.hui);
        this.LIZJ = (TuxTextView) anchor.findViewById(R.id.hug);
        this.LIZLLL = anchor.findViewById(R.id.l_p);
        this.LJ = (TuxTextView) anchor.findViewById(R.id.hv1);
        this.LJFF = (ViewGroup) anchor.findViewById(R.id.l04);
        this.LJI = (TuxTextView) anchor.findViewById(R.id.bm_);
        this.LJII = anchor.findViewById(R.id.bld);
        this.LJIIIIZZ = (TuxTextView) anchor.findViewById(R.id.bma);
        this.LJIIIZ = anchor.findViewById(R.id.hu9);
        ViewGroup viewGroup = this.LIZIZ;
        if (viewGroup != null) {
            C26338AVi.LJI(viewGroup, null, null, C1FJ.LIZIZ(16), null, false, 27);
        }
        ViewGroup viewGroup2 = this.LJFF;
        if (viewGroup2 != null) {
            C26338AVi.LJI(viewGroup2, null, null, C1FJ.LIZIZ(16), null, false, 27);
        }
        TuxTextView tuxTextView2 = this.LIZJ;
        PoiDataStruct poiDataStruct = this.LJIIJ;
        String str7 = null;
        if (poiDataStruct != null) {
            str = poiDataStruct.getPoiName();
        } else {
            str = null;
        }
        LIZJ(tuxTextView2, str);
        TuxTextView tuxTextView3 = this.LJ;
        PoiDataStruct poiDataStruct2 = this.LJIIJ;
        if (poiDataStruct2 != null && (commentAnchor4 = poiDataStruct2.getCommentAnchor()) != null) {
            str2 = commentAnchor4.getSuffix();
        } else {
            str2 = null;
        }
        LIZJ(tuxTextView3, str2);
        TuxTextView tuxTextView4 = this.LJ;
        if (tuxTextView4 != null && (text4 = tuxTextView4.getText()) != null) {
            str3 = text4.toString();
        } else {
            str3 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            View view = this.LIZLLL;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            View view2 = this.LIZLLL;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        C34K c34k = new C34K();
        PoiDataStruct poiDataStruct3 = this.LJIIJ;
        if (poiDataStruct3 != null && (commentAnchor3 = poiDataStruct3.getCommentAnchor()) != null && (subTags2 = commentAnchor3.getSubTags()) != null && (!subTags2.isEmpty())) {
            int min = Math.min(1, subTags2.size() - 1);
            if (min >= 0) {
                int i = 0;
                while (true) {
                    String str8 = "";
                    if (i != 0) {
                        if (i == 1) {
                            TuxTextView tuxTextView5 = this.LJIIIIZZ;
                            String name = ((PoiSubTag) ListProtector.get(subTags2, i)).getName();
                            if (name != null) {
                                str8 = name;
                            }
                            LIZJ(tuxTextView5, str8);
                        }
                    } else {
                        TuxTextView tuxTextView6 = this.LJI;
                        String name2 = ((PoiSubTag) ListProtector.get(subTags2, i)).getName();
                        if (name2 != null) {
                            str8 = name2;
                        }
                        LIZJ(tuxTextView6, str8);
                    }
                    if (i == min) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            Iterator it = new ArrayList(subTags2).iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int priority = ((PoiSubTag) next).getPriority();
                    do {
                        Object next2 = it.next();
                        int priority2 = ((PoiSubTag) next2).getPriority();
                        if (priority < priority2) {
                            next = next2;
                            priority = priority2;
                        }
                    } while (it.hasNext());
                }
            }
            PoiSubTag poiSubTag = (PoiSubTag) next;
            if (poiSubTag != null) {
                String name3 = poiSubTag.getName();
                TuxTextView tuxTextView7 = this.LJI;
                if (tuxTextView7 != null && (text3 = tuxTextView7.getText()) != null) {
                    str5 = text3.toString();
                } else {
                    str5 = null;
                }
                if (o.LJ(name3, str5)) {
                    c34k.element = true;
                } else {
                    String name4 = poiSubTag.getName();
                    TuxTextView tuxTextView8 = this.LJIIIIZZ;
                    if (tuxTextView8 != null && (text2 = tuxTextView8.getText()) != null) {
                        str6 = text2.toString();
                    } else {
                        str6 = null;
                    }
                    if (o.LJ(name4, str6)) {
                        c34k.element = false;
                    }
                }
            }
        }
        PoiDataStruct poiDataStruct4 = this.LJIIJ;
        if ((poiDataStruct4 == null || (commentAnchor2 = poiDataStruct4.getCommentAnchor()) == null || (subTags = commentAnchor2.getSubTags()) == null || subTags.isEmpty()) && (tuxTextView = this.LJI) != null) {
            if (C78685UuP.LJJJZ(anchor.LIZJ())) {
                String LIZJ = anchor.LIZJ();
                PoiAnchorData poiAnchorData = anchor.LJLJI.LJLILLLLZI;
                if (poiAnchorData != null) {
                    str4 = poiAnchorData.getPoiName();
                } else {
                    str4 = null;
                }
                if (!o.LJ(LIZJ, str4)) {
                    LIZ = anchor.LIZJ();
                    tuxTextView.setText(LIZ);
                }
            }
            LIZ = anchor.LJLJI.LIZ(Q7K.LIZIZ("comment_poi_video_count_threshold", 100));
            tuxTextView.setText(LIZ);
        }
        TuxTextView tuxTextView9 = this.LJIIIIZZ;
        if (tuxTextView9 != null && (text = tuxTextView9.getText()) != null) {
            str7 = text.toString();
        }
        if (TextUtils.isEmpty(str7)) {
            View view3 = this.LJII;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            View view4 = this.LJII;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        PoiDataStruct poiDataStruct5 = this.LJIIJ;
        if (poiDataStruct5 != null && (commentAnchor = poiDataStruct5.getCommentAnchor()) != null && commentAnchor.getHasSubArrow()) {
            View view5 = this.LJIIIZ;
            if (view5 != null) {
                view5.setVisibility(0);
            }
        } else {
            View view6 = this.LJIIIZ;
            if (view6 != null) {
                view6.setVisibility(8);
            }
        }
        LC5.LIZJ(this.LIZJ, this.LJ, this.LIZIZ, true, C7MY.LIZIZ(13), LC5.LIZIZ(this.LJIIIZ), new AqS57S0400000_12(this, c34k, aweme, poiAnchorMaker, 12));
    }
}
