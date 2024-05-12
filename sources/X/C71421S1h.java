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
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.S1h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71421S1h implements InterfaceC191587fW {
    public ViewGroup LIZ;
    public TuxTextView LIZIZ;
    public View LIZJ;
    public TuxTextView LIZLLL;
    public ViewGroup LJ;
    public TuxTextView LJFF;
    public View LJI;
    public TuxTextView LJII;
    public View LJIIIIZZ;
    public PoiDataStruct LJIIIZ;

    public static void LIZIZ(TuxTextView tuxTextView, String str) {
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

    @Override // X.InterfaceC191587fW
    public final void LIZ(Aweme aweme, C191577fV anchorItem, S1U poiAnchorMaker) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        TuxTextView tuxTextView;
        String LIZ;
        String str6;
        PoiAnchorInfo commentAnchor;
        CharSequence text;
        PoiAnchorInfo commentAnchor2;
        List<PoiSubTag> subTags;
        PoiAnchorInfo commentAnchor3;
        List<PoiSubTag> subTags2;
        Object next;
        String str7;
        String str8;
        CharSequence text2;
        CharSequence text3;
        CharSequence text4;
        PoiAnchorInfo commentAnchor4;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(anchorItem, "anchorItem");
        o.LJIIIZ(poiAnchorMaker, "poiAnchorMaker");
        this.LJIIIZ = aweme.getPoiDataStruct();
        this.LIZ = (ViewGroup) anchorItem.findViewById(R.id.hui);
        this.LIZIZ = (TuxTextView) anchorItem.findViewById(R.id.hug);
        this.LIZJ = anchorItem.findViewById(R.id.l_p);
        this.LIZLLL = (TuxTextView) anchorItem.findViewById(R.id.hv1);
        this.LJ = (ViewGroup) anchorItem.findViewById(R.id.l04);
        this.LJFF = (TuxTextView) anchorItem.findViewById(R.id.kzl);
        this.LJI = anchorItem.findViewById(R.id.l0b);
        this.LJII = (TuxTextView) anchorItem.findViewById(R.id.kzm);
        this.LJIIIIZZ = anchorItem.findViewById(R.id.hu9);
        TuxTextView tuxTextView2 = this.LIZIZ;
        PoiDataStruct poiDataStruct = this.LJIIIZ;
        String str9 = null;
        if (poiDataStruct != null) {
            str = poiDataStruct.getPoiName();
        } else {
            str = null;
        }
        LIZIZ(tuxTextView2, str);
        TuxTextView tuxTextView3 = this.LIZLLL;
        PoiDataStruct poiDataStruct2 = this.LJIIIZ;
        if (poiDataStruct2 != null && (commentAnchor4 = poiDataStruct2.getCommentAnchor()) != null) {
            str2 = commentAnchor4.getSuffix();
        } else {
            str2 = null;
        }
        LIZIZ(tuxTextView3, str2);
        PoiDataStruct poiDataStruct3 = this.LJIIIZ;
        if (poiDataStruct3 != null) {
            str3 = poiDataStruct3.getPoiName();
        } else {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            TuxTextView tuxTextView4 = this.LIZIZ;
            PoiAnchorData poiAnchorData = anchorItem.LJLIL.LJLILLLLZI;
            if (poiAnchorData != null) {
                str4 = poiAnchorData.getPoiName();
            } else {
                str4 = null;
            }
            LIZIZ(tuxTextView4, str4);
        }
        TuxTextView tuxTextView5 = this.LIZLLL;
        if (tuxTextView5 != null && (text4 = tuxTextView5.getText()) != null) {
            str5 = text4.toString();
        } else {
            str5 = null;
        }
        if (TextUtils.isEmpty(str5)) {
            View view = this.LIZJ;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            View view2 = this.LIZJ;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        C34K c34k = new C34K();
        PoiDataStruct poiDataStruct4 = this.LJIIIZ;
        if (poiDataStruct4 != null && (commentAnchor3 = poiDataStruct4.getCommentAnchor()) != null && (subTags2 = commentAnchor3.getSubTags()) != null && (!subTags2.isEmpty())) {
            int min = Math.min(1, subTags2.size() - 1);
            if (min >= 0) {
                int i = 0;
                while (true) {
                    String str10 = "";
                    if (i != 0) {
                        if (i == 1) {
                            TuxTextView tuxTextView6 = this.LJII;
                            String name = ((PoiSubTag) ListProtector.get(subTags2, i)).getName();
                            if (name != null) {
                                str10 = name;
                            }
                            LIZIZ(tuxTextView6, str10);
                        }
                    } else {
                        TuxTextView tuxTextView7 = this.LJFF;
                        String name2 = ((PoiSubTag) ListProtector.get(subTags2, i)).getName();
                        if (name2 != null) {
                            str10 = name2;
                        }
                        LIZIZ(tuxTextView7, str10);
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
                TuxTextView tuxTextView8 = this.LJFF;
                if (tuxTextView8 != null && (text3 = tuxTextView8.getText()) != null) {
                    str7 = text3.toString();
                } else {
                    str7 = null;
                }
                if (o.LJ(name3, str7)) {
                    c34k.element = true;
                } else {
                    String name4 = poiSubTag.getName();
                    TuxTextView tuxTextView9 = this.LJII;
                    if (tuxTextView9 != null && (text2 = tuxTextView9.getText()) != null) {
                        str8 = text2.toString();
                    } else {
                        str8 = null;
                    }
                    if (o.LJ(name4, str8)) {
                        c34k.element = false;
                    }
                }
            }
        }
        PoiDataStruct poiDataStruct5 = this.LJIIIZ;
        if ((poiDataStruct5 == null || (commentAnchor2 = poiDataStruct5.getCommentAnchor()) == null || (subTags = commentAnchor2.getSubTags()) == null || subTags.isEmpty()) && (tuxTextView = this.LJFF) != null) {
            if (C78685UuP.LJJJZ(anchorItem.LIZJ())) {
                String LIZJ = anchorItem.LIZJ();
                PoiAnchorData poiAnchorData2 = anchorItem.LJLIL.LJLILLLLZI;
                if (poiAnchorData2 != null) {
                    str6 = poiAnchorData2.getPoiName();
                } else {
                    str6 = null;
                }
                if (!o.LJ(LIZJ, str6)) {
                    LIZ = anchorItem.LIZJ();
                    tuxTextView.setText(LIZ);
                }
            }
            LIZ = anchorItem.LJLIL.LIZ(Q7K.LIZIZ("comment_poi_video_count_threshold", 100));
            tuxTextView.setText(LIZ);
        }
        TuxTextView tuxTextView10 = this.LJII;
        if (tuxTextView10 != null && (text = tuxTextView10.getText()) != null) {
            str9 = text.toString();
        }
        if (TextUtils.isEmpty(str9)) {
            View view3 = this.LJI;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            View view4 = this.LJI;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        PoiDataStruct poiDataStruct6 = this.LJIIIZ;
        if (poiDataStruct6 != null && (commentAnchor = poiDataStruct6.getCommentAnchor()) != null && commentAnchor.getHasSubArrow()) {
            View view5 = this.LJIIIIZZ;
            if (view5 != null) {
                view5.setVisibility(0);
            }
        } else {
            View view6 = this.LJIIIIZZ;
            if (view6 != null) {
                view6.setVisibility(8);
            }
        }
        LC5.LIZJ(this.LIZIZ, this.LIZLLL, this.LIZ, true, LC5.LIZIZ(this.LIZJ), LC5.LIZIZ(this.LJIIIIZZ), new AqS143S0200000_12(this, c34k, 117));
    }
}
