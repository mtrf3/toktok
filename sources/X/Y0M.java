package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0M implements InterfaceC86702Y1a {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ InteractStickerStruct LIZIZ;

    @Override // X.InterfaceC86702Y1a
    public final Y1E LIZ() {
        C223048pA c223048pA;
        float f;
        Context mContext = this.LIZ.LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        InteractStickerWidget interactStickerWidget = this.LIZ;
        C245649kW c245649kW = interactStickerWidget.LJLJLLL;
        InteractStickerStruct interactStickerStruct = this.LIZIZ;
        C224048qm c224048qm = interactStickerWidget.LJLL;
        o.LJI(c224048qm);
        o.LJIIIZ(interactStickerStruct, "interactStickerStruct");
        if (c245649kW != null) {
            InterfaceC86704Y1c interfaceC86704Y1c = c245649kW.LJIILIIL;
            if (interfaceC86704Y1c != null) {
                c223048pA = interfaceC86704Y1c.LIZ();
            } else {
                c223048pA = null;
            }
            float f2 = 0.0f;
            if (c245649kW != null) {
                if (c223048pA != null) {
                    f = c223048pA.LIZ;
                } else {
                    f = 0.0f;
                }
                c245649kW.LIZ = f;
                if (c223048pA != null) {
                    f2 = c223048pA.LIZIZ;
                }
                c245649kW.LIZIZ = f2;
            }
        }
        return new AbstractC224038ql(interactStickerStruct.getType(), mContext, c224048qm, interactStickerStruct, c245649kW) { // from class: X.8qY
            public final C223898qX LJLLI;
            public final C62822Ol8 LJLLILLLL;
            public DialogC26282ATe LJLLJ;

            @Override // X.Y1I
            public final void LJJII() {
            }

            @Override // X.Y1I
            public final void LJJIIZ() {
            }

            @Override // X.Y1E
            public final int getStickerType() {
                return 5;
            }

            @Override // X.AbstractC224038ql
            public final View LJIILLIIL() {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                LinearLayout linearLayout = new LinearLayout(this.LJLILLLLZI);
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(0);
                TuxTextView tuxTextView = new TuxTextView(this.LJLILLLLZI, null, 6, 0);
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJLILLLLZI));
                tuxTextView.setTuxFont(62);
                tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                tuxTextView.setMaxLines(1);
                tuxTextView.setGravity(16);
                tuxTextView.setText(this.LJLILLLLZI.getString(R.string.h25));
                C116474hf c116474hf = new C116474hf(this.LJLILLLLZI, null);
                c116474hf.setImageResource(R.drawable.bvr);
                linearLayout.addView(tuxTextView);
                linearLayout.addView(c116474hf);
                return linearLayout;
            }

            @Override // X.AbstractC224038ql
            public final void LJIJI() {
                String str;
                String str2;
                String str3;
                C223778qL c223778qL;
                C223778qL c223778qL2;
                C223778qL c223778qL3;
                LogPbBean logPbBean = new LogPbBean();
                C245649kW c245649kW2 = this.LJLJJI;
                if (c245649kW2 == null || (str = c245649kW2.LJIIJJI) == null) {
                    str = "";
                }
                logPbBean.setImprId(str);
                C188727au c188727au = new C188727au();
                C245649kW c245649kW3 = this.LJLJJI;
                String str4 = null;
                if (c245649kW3 != null && (c223778qL3 = c245649kW3.LJIIZILJ) != null) {
                    str2 = c223778qL3.LIZ;
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("enter_from", str2);
                C245649kW c245649kW4 = this.LJLJJI;
                if (c245649kW4 != null && (c223778qL2 = c245649kW4.LJIIZILJ) != null) {
                    str3 = c223778qL2.LIZJ;
                } else {
                    str3 = null;
                }
                c188727au.LJIIIZ("group_id", str3);
                C245649kW c245649kW5 = this.LJLJJI;
                if (c245649kW5 != null && (c223778qL = c245649kW5.LJIIZILJ) != null) {
                    str4 = c223778qL.LIZIZ;
                }
                c188727au.LJIIIZ("author_id", str4);
                c188727au.LJIIIZ("sticker_type", "wiki");
                c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZ(logPbBean));
                FMX.LJIIL("sticker_click", c188727au.LIZ);
            }

            @Override // X.AbstractC224038ql
            public final void LJIJJ() {
                String str;
                String str2;
                String str3;
                String str4;
                C223908qY c223908qY;
                String str5;
                String str6;
                String str7;
                C223778qL c223778qL;
                String str8;
                C223778qL c223778qL2;
                C223778qL c223778qL3;
                String str9;
                String str10;
                C223778qL c223778qL4;
                String str11;
                C223778qL c223778qL5;
                C223778qL c223778qL6;
                C223778qL c223778qL7;
                C223778qL c223778qL8;
                C223778qL c223778qL9;
                C223898qX c223898qX = this.LJLLI;
                if (c223898qX.LJLJJL.getValue() == null || ((TextStruct) c223898qX.LJLJJL.getValue()).getAnchors().isEmpty()) {
                    return;
                }
                LogPbBean logPbBean = new LogPbBean();
                C245649kW c245649kW2 = c223898qX.LJLJJI;
                String str12 = "";
                if (c245649kW2 == null || (str = c245649kW2.LJIIJJI) == null) {
                    str = "";
                }
                logPbBean.setImprId(str);
                C188727au c188727au = new C188727au();
                C245649kW c245649kW3 = c223898qX.LJLJJI;
                if (c245649kW3 == null || (c223778qL9 = c245649kW3.LJIIZILJ) == null || (str2 = c223778qL9.LIZJ) == null) {
                    str2 = "";
                }
                c188727au.LJIIIZ("group_id", str2);
                C245649kW c245649kW4 = c223898qX.LJLJJI;
                if (c245649kW4 == null || (c223778qL8 = c245649kW4.LJIIZILJ) == null || (str3 = c223778qL8.LIZIZ) == null) {
                    str3 = "";
                }
                c188727au.LJIIIZ("author_id", str3);
                C245649kW c245649kW5 = c223898qX.LJLJJI;
                if (c245649kW5 == null || (c223778qL7 = c245649kW5.LJIIZILJ) == null || (str4 = c223778qL7.LIZ) == null) {
                    str4 = "";
                }
                c188727au.LJIIIZ("enter_from", str4);
                c188727au.LJIIIZ("sticker_type", "wiki");
                c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZ(logPbBean));
                FMX.LJIIL("sticker_toast_click", c188727au.LIZ);
                List<CreateAnchorInfo> anchors = ((TextStruct) c223898qX.LJLJJL.getValue()).getAnchors();
                ArrayList arrayList = new ArrayList(C32I.LJJL(anchors, 10));
                for (CreateAnchorInfo createAnchorInfo : anchors) {
                    WikipediaExtra wikipediaExtra = (WikipediaExtra) GsonProtectorUtils.fromJson(new Gson(), createAnchorInfo.getContent(), WikipediaExtra.class);
                    WikipediaInfo wikipediaInfo = new WikipediaInfo();
                    wikipediaInfo.setKeyword(createAnchorInfo.getKeyword());
                    wikipediaInfo.setLang(createAnchorInfo.getLanguage());
                    wikipediaInfo.setExtra(wikipediaExtra);
                    wikipediaInfo.setAnchorId(createAnchorInfo.getThirdId());
                    arrayList.add(wikipediaInfo);
                }
                List<WikipediaInfo> LJLJJL = ORZ.LJLJJL(arrayList);
                if (LJLJJL.size() == 1) {
                    C223928qa.LIZ(c223898qX.LJLIL, (WikipediaInfo) ListProtector.get(LJLJJL, 0), c223898qX.LJIIIIZZ(), C113554cx.LJJJLIIL());
                    C188727au c188727au2 = new C188727au();
                    C245649kW c245649kW6 = c223898qX.LJLJJI;
                    if (c245649kW6 == null || (c223778qL6 = c245649kW6.LJIIZILJ) == null || (str9 = c223778qL6.LIZ) == null) {
                        str9 = "";
                    }
                    c188727au2.LJIIIZ("enter_from", str9);
                    c188727au2.LJIIIZ("language", ((WikipediaInfo) ListProtector.get(LJLJJL, 0)).getLang());
                    c188727au2.LJIIIZ("wiki_entry", ((WikipediaInfo) ListProtector.get(LJLJJL, 0)).getKeyword());
                    C245649kW c245649kW7 = c223898qX.LJLJJI;
                    if (c245649kW7 == null || (c223778qL5 = c245649kW7.LJIIZILJ) == null || (str10 = c223778qL5.LIZIZ) == null) {
                        str10 = "";
                    }
                    c188727au2.LJIIIZ("author_id", str10);
                    C245649kW c245649kW8 = c223898qX.LJLJJI;
                    if (c245649kW8 != null && (c223778qL4 = c245649kW8.LJIIZILJ) != null && (str11 = c223778qL4.LIZJ) != null) {
                        str12 = str11;
                    }
                    c188727au2.LJIIIZ("group_id", str12);
                    FMX.LJIIL("enter_wiki_detail", c188727au2.LIZ);
                    return;
                }
                AbstractC224038ql abstractC224038ql = c223898qX.LJLILLLLZI;
                if (!(abstractC224038ql instanceof C223908qY) || (c223908qY = (C223908qY) abstractC224038ql) == null) {
                    return;
                }
                java.util.Map<String, String> LJIIIIZZ = c223898qX.LJIIIIZZ();
                if (c223908qY.LJLLJ == null) {
                    c223908qY.LJLLJ = new DialogC26282ATe(c223908qY.LJLILLLLZI, LJLJJL, LJIIIIZZ, new AqS169S0100000_3(c223908qY, 984), new AqS153S0100000_3(c223908qY, 1718));
                }
                DialogC26282ATe dialogC26282ATe = c223908qY.LJLLJ;
                if (dialogC26282ATe != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/commercialize/anchor/AnchorSelectPanel", "show", dialogC26282ATe, new Object[0], "void", new C65300Pk0(false, "()V", "3747342035747384774")).LIZ) {
                    dialogC26282ATe.show();
                }
                StringBuilder sb = new StringBuilder("");
                StringBuilder sb2 = new StringBuilder("");
                for (WikipediaInfo wikipediaInfo2 : LJLJJL) {
                    sb.append("wiki,");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(wikipediaInfo2.getKeyword());
                    LIZ.append(',');
                    sb2.append(X1D.LIZIZ(LIZ));
                }
                LogPbBean logPbBean2 = new LogPbBean();
                C245649kW c245649kW9 = c223908qY.LJLJJI;
                if (c245649kW9 == null || (str5 = c245649kW9.LJIIJJI) == null) {
                    str5 = "";
                }
                logPbBean2.setImprId(str5);
                C188727au c188727au3 = new C188727au();
                C245649kW c245649kW10 = c223908qY.LJLJJI;
                if (c245649kW10 == null || (c223778qL3 = c245649kW10.LJIIZILJ) == null || (str6 = c223778qL3.LIZ) == null) {
                    str6 = "";
                }
                c188727au3.LJIIIZ("enter_from", str6);
                C245649kW c245649kW11 = c223908qY.LJLJJI;
                if (c245649kW11 == null || (c223778qL2 = c245649kW11.LJIIZILJ) == null || (str7 = c223778qL2.LIZJ) == null) {
                    str7 = "";
                }
                c188727au3.LJIIIZ("group_id", str7);
                c188727au3.LJIIIZ("log_pb", C3A5.LIZ.LIZ(logPbBean2));
                C245649kW c245649kW12 = c223908qY.LJLJJI;
                if (c245649kW12 != null && (c223778qL = c245649kW12.LJIIZILJ) != null && (str8 = c223778qL.LIZIZ) != null) {
                    str12 = str8;
                }
                c188727au3.LJIIIZ("author_id", str12);
                c188727au3.LJIIIZ("sticker_type", "wiki");
                c188727au3.LJIIIZ("anchor_types", sb.toString());
                c188727au3.LJIIIZ("anchor_names", sb2.toString());
                FMX.LJIIL("anchor_multiple_show", c188727au3.LIZ);
            }

            @Override // X.Y1I
            public final View LIZ(int i) {
                return (View) this.LJLLILLLL.getValue();
            }

            @Override // X.AbstractC224038ql, X.Y1P
            public final void LJII(C245649kW interactStickerParams) {
                o.LJIIIZ(interactStickerParams, "interactStickerParams");
                this.LJLJJI = interactStickerParams;
                C223898qX c223898qX = this.LJLLI;
                c223898qX.getClass();
                c223898qX.LJLJJI = interactStickerParams;
            }

            @Override // X.Y1P
            public final boolean LJIIJJI(long j, float f3, float f4, int i) {
                return this.LJLLI.LJIIJJI(j, f3, f4, i);
            }

            {
                this.LJLLI = new C223898qX(mContext, this, interactStickerStruct, c245649kW);
                this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(mContext, 1719));
            }

            @Override // X.Y1P
            public final boolean LJIILIIL(long j, int i, float f3, float f4, InterfaceC221818nB popListener) {
                o.LJIIIZ(popListener, "popListener");
                return this.LJLLI.LJIILIIL(j, i, f3, f4, popListener);
            }
        };
    }

    public Y0M(InteractStickerWidget interactStickerWidget, InteractStickerStruct interactStickerStruct) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = interactStickerStruct;
    }
}
