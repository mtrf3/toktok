package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224018qj extends AbstractC224038ql {
    public final InterfaceC223648q8 LJLLI;
    public final BusinessExtraData LJLLILLLL;
    public final Aweme LJLLJ;
    public View LJLLL;
    public final C224008qi LJLLLL;
    public final Handler LJLLLLLL;
    public final ARunnableS39S0100000_3 LJLZ;

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 2;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        String str;
        String str2;
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.LJLILLLLZI);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        C72433Sbl c72433Sbl = new C72433Sbl(this.LJLILLLLZI);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) KL2.LIZJ(this.LJLILLLLZI, 32.0f), (int) KL2.LIZJ(this.LJLILLLLZI, 32.0f));
        layoutParams2.setMargins(0, 0, (int) KL2.LIZJ(this.LJLILLLLZI, 8.0f), 0);
        c72433Sbl.setLayoutParams(layoutParams2);
        ((V92) c72433Sbl.getHierarchy()).LJIJ(R.drawable.bkk);
        ((V92) c72433Sbl.getHierarchy()).LJIIZILJ(R.drawable.bkk);
        BusinessExtraData businessExtraData = this.LJLLILLLL;
        if (businessExtraData != null) {
            str = businessExtraData.getPopIcon();
        } else {
            str = null;
        }
        C78765Uvh.LJIIIZ(c72433Sbl, str, -1, -1);
        TuxTextView tuxTextView = new TuxTextView(this.LJLILLLLZI, null, 6, 0);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, this.LJLILLLLZI));
        tuxTextView.setTuxFont(62);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.topMargin = (int) KL2.LIZJ(this.LJLILLLLZI, 1.0f);
        tuxTextView.setLayoutParams(layoutParams3);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        BusinessExtraData businessExtraData2 = this.LJLLILLLL;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getPopText();
        } else {
            str2 = null;
        }
        tuxTextView.setText(str2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C116474hf c116474hf = new C116474hf(this.LJLILLLLZI, null);
        c116474hf.setImageResource(R.drawable.bvr);
        linearLayout.addView(c72433Sbl);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(c116474hf);
        return linearLayout;
    }

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C188727au c188727au = new C188727au();
        BusinessExtraData businessExtraData = this.LJLLILLLL;
        String str7 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("prop_id", str);
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str2 = c223778qL4.LIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("enter_from", str2);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str3 = c223778qL3.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str4 = c223778qL2.LIZIZ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("author_id", str4);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str5 = c223778qL.LIZJ;
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("group_id", str5);
        BusinessExtraData businessExtraData2 = this.LJLLILLLL;
        if (businessExtraData2 != null) {
            str6 = businessExtraData2.getSchemaUrlWebFirst();
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("enter_method", C223998qh.LIZLLL(str6));
        BusinessExtraData businessExtraData3 = this.LJLLILLLL;
        if (businessExtraData3 != null) {
            str7 = businessExtraData3.getSchemaUrlWebFirst();
        }
        c188727au.LJIIIZ("url", str7);
        FMX.LJIIL("function_prop_click", c188727au.LIZ);
        Aweme aweme = this.LJLLJ;
        if (aweme != null && aweme.isAd()) {
            Context context = this.LJLILLLLZI;
            Aweme aweme2 = this.LJLLJ;
            NN1.LJJJJI(context, "otherclick", aweme2, NN1.LJIIJ(context, aweme2, "sticker"));
            C58704N2e.LIZLLL("draw_ad", "otherclick", this.LJLLJ.getAwemeRawAd()).LJII();
            BusinessExtraData businessExtraData4 = this.LJLLILLLL;
            if (businessExtraData4 != null) {
                businessExtraData4.getStickerId();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        if (X.NO5.LJI(r1, r0, false) == false) goto L55;
     */
    @Override // X.AbstractC224038ql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224018qj.LJIJJ():void");
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void onPause() {
        Handler handler = this.LJLLLLLL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void onResume() {
        Handler handler;
        ARunnableS39S0100000_3 aRunnableS39S0100000_3 = this.LJLZ;
        if (aRunnableS39S0100000_3 != null && (handler = this.LJLLLLLL) != null) {
            handler.post(aRunnableS39S0100000_3);
        }
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        if (C223998qh.LJ(this.LJLILLLLZI)) {
            if (this.LJLLL == null) {
                this.LJLLL = new C221788n8(this.LJLILLLLZI);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.LJLLL;
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
            return this.LJLLL;
        }
        if (this.LJLLL == null) {
            this.LJLLL = new FrameLayout(this.LJLILLLLZI);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view2 = this.LJLLL;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
        }
        return this.LJLLL;
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
        C224008qi c224008qi = this.LJLLLL;
        c224008qi.getClass();
        c224008qi.LJLJJI = interactStickerParams;
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void LJIIIIZZ(int i) {
        super.LJIIIIZZ(i);
        Handler handler = this.LJLLLLLL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.AbstractC224038ql
    public final void LJIILJJIL(C81259Vup c81259Vup) {
        int LIZJ = (int) KL2.LIZJ(this.LJLILLLLZI, 57.9f);
        c81259Vup.LIZLLL = LIZJ;
        c81259Vup.setHeight(LIZJ);
        C136845Yq.LLFII = LIZJ;
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        return LJIILIIL(j, i, f, f2, popListener);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.8qi] */
    public C224018qj(int i, Context context, C224048qm c224048qm, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, InterfaceC223648q8 interfaceC223648q8, BusinessExtraData businessExtraData, Aweme aweme) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        this.LJLLI = interfaceC223648q8;
        this.LJLLILLLL = businessExtraData;
        this.LJLLJ = aweme;
        this.LJLLLL = new AbstractC221838nD(context, this, interactStickerStruct, c245649kW, businessExtraData) { // from class: X.8qi
            public final BusinessExtraData LJLJJL;

            @Override // X.AbstractC221838nD
            public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
                List list;
                long j2;
                boolean z;
                o.LJIIIZ(stickerStruct, "stickerStruct");
                ArrayList arrayList = null;
                try {
                    list = (List) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), stickerStruct.getTrackList(), new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.2T2
                    }.getType());
                } catch (s e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("InteractStickerUtils.kt : e ");
                    LIZ.append(e);
                    C36922EeM.LJ(X1D.LIZIZ(LIZ));
                    list = null;
                }
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        BaseTrackTimeStamp baseTrackTimeStamp = (BaseTrackTimeStamp) obj;
                        if (baseTrackTimeStamp != null) {
                            j2 = baseTrackTimeStamp.getPts();
                        } else {
                            j2 = 0;
                        }
                        long j3 = j - j2;
                        if (-160 <= j3 && j3 < 161) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                }
                return arrayList;
            }

            @Override // X.AbstractC221838nD
            public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
                String str7;
                o.LJIIIZ(popListener, "popListener");
                BusinessExtraData businessExtraData2 = this.LJLJJL;
                if (businessExtraData2 != null) {
                    str7 = businessExtraData2.getSchemaUrlOpenFirst();
                } else {
                    str7 = null;
                }
                if (C56209M4f.LIZ(str7)) {
                    return;
                }
                popListener.LIZ(this.LJLILLLLZI.LJIJJLI(f, f2));
            }

            @Override // X.AbstractC221838nD, X.Y1P
            public final boolean LJIIJJI(long j, float f, float f2, int i2) {
                String str7;
                BusinessExtraData businessExtraData2 = this.LJLJJL;
                String str8 = null;
                if (businessExtraData2 != null) {
                    str7 = businessExtraData2.getStickerId();
                } else {
                    str7 = null;
                }
                if (TextUtils.isEmpty(str7)) {
                    return false;
                }
                BusinessExtraData businessExtraData3 = this.LJLJJL;
                if (businessExtraData3 != null) {
                    str8 = businessExtraData3.getSchemaUrlOpenFirst();
                }
                if (TextUtils.isEmpty(str8)) {
                    return false;
                }
                return super.LJIIJJI(j, f, f2, i2);
            }

            {
                o.LJIIIZ(this, "view");
                this.LJLJJL = businessExtraData;
            }
        };
        if (C223998qh.LJ(context)) {
            ARunnableS39S0100000_3 aRunnableS39S0100000_3 = new ARunnableS39S0100000_3(this, 218);
            this.LJLZ = aRunnableS39S0100000_3;
            Handler handler = new Handler();
            this.LJLLLLLL = handler;
            handler.post(aRunnableS39S0100000_3);
        }
        if (aweme != null && aweme.isAd()) {
            NN1.LJJJJI(context, "othershow", aweme, NN1.LJIIJ(context, aweme, "sticker"));
            C58704N2e.LIZLLL("draw_ad", "othershow", aweme.getAwemeRawAd()).LJII();
        }
        C188727au c188727au = new C188727au();
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("prop_id", str);
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str2 = c223778qL4.LIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("enter_from", str2);
        if (c245649kW != null && (c223778qL3 = c245649kW.LJIIZILJ) != null) {
            str3 = c223778qL3.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        if (c245649kW != null && (c223778qL2 = c245649kW.LJIIZILJ) != null) {
            str4 = c223778qL2.LIZIZ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("author_id", str4);
        if (c245649kW != null && (c223778qL = c245649kW.LJIIZILJ) != null) {
            str5 = c223778qL.LIZJ;
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("group_id", str5);
        if (businessExtraData != null) {
            str6 = businessExtraData.getSchemaUrlWebFirst();
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("enter_method", C223998qh.LIZLLL(str6));
        c188727au.LJIIIZ("url", businessExtraData != null ? businessExtraData.getSchemaUrlWebFirst() : null);
        FMX.LJIIL("function_prop_show", c188727au.LIZ);
    }
}
