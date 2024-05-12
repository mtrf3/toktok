package X;

import Y.ACListenerS24S0201000_7;
import Y.IDTListenerS116S0100000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagData;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gr7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42809Gr7 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<C42802Gr0> LJLIL;
    public final Context LJLILLLLZI;
    public final InterfaceC42808Gr6 LJLJI;
    public boolean LJLJJI;
    public final HashTagMobHelper LJLJJL;
    public String LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((C42802Gr0) ListProtector.get(this.LJLIL, i)).LIZIZ;
    }

    public final void LJLZ(C42802Gr0 c42802Gr0, int i) {
        String str;
        HashTagMobHelper hashTagMobHelper = this.LJLJJL;
        if (hashTagMobHelper != null) {
            Integer valueOf = Integer.valueOf(i);
            String str2 = "";
            String str3 = null;
            if (valueOf != null) {
                valueOf.intValue();
                AVChallenge aVChallenge = c42802Gr0.LIZ;
                if (aVChallenge == null || (str = aVChallenge.challengeName) == null) {
                    str = "";
                }
                String str4 = hashTagMobHelper.LJLJLJ;
                String str5 = aVChallenge.cid;
                String str6 = c42802Gr0.LJFF;
                o.LJIIIIZZ(str6, "item.tagSource");
                hashTagMobHelper.kv0(new C42310Gj4(str, str4, str5, str6, valueOf));
            }
            if (TextUtils.equals(c42802Gr0.LJFF, "search")) {
                HashTagMobHelper hashTagMobHelper2 = this.LJLJJL;
                Integer valueOf2 = Integer.valueOf(i);
                hashTagMobHelper2.getClass();
                if (valueOf2 != null) {
                    valueOf2.intValue();
                    String str7 = c42802Gr0.LIZ.cid;
                    C76W c76w = new C76W();
                    c76w.LIZ("words_content", c42802Gr0.LIZ.challengeName);
                    c76w.LIZ("words_position", valueOf2.toString());
                    c76w.LIZ("words_source", "sug");
                    c76w.LIZ("search_position", "challenge_create");
                    c76w.LIZ("raw_query", hashTagMobHelper2.LJLJJI);
                    c76w.LIZ("rank", "-1");
                    RecommendWordMob recommendWordMob = hashTagMobHelper2.LJLJI;
                    if (recommendWordMob != null) {
                        str3 = recommendWordMob.getQueryId();
                    }
                    c76w.LIZ("query_id", str3);
                    c76w.LIZ("group_id", str7);
                    LogPbBean logPbBean = hashTagMobHelper2.LJLILLLLZI;
                    if (logPbBean != null) {
                        str2 = logPbBean.getImprId();
                    }
                    c76w.LIZ("impr_id", str2);
                    FMX.LJIILJJIL("trending_words_show", c76w.LIZIZ());
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C42802Gr0 c42802Gr0;
        int i2;
        if (i >= 0 && i < this.LJLIL.size()) {
            c42802Gr0 = (C42802Gr0) ListProtector.get(this.LJLIL, i);
        } else {
            c42802Gr0 = null;
        }
        String str = "";
        if ((viewHolder instanceof C42810Gr8) && c42802Gr0 != null) {
            String challengeName = c42802Gr0.LIZ.getChallengeName();
            if (challengeName == null) {
                challengeName = "";
            }
            if (!challengeName.startsWith("#")) {
                challengeName = i0.LJFF("#", challengeName);
            }
            if (TextUtils.equals(c42802Gr0.LJFF, "search")) {
                str = "search_hashtag";
            } else if (TextUtils.equals(c42802Gr0.LJFF, "history")) {
                str = "history_hashtag";
            } else if (TextUtils.equals(c42802Gr0.LJFF, "recommendation")) {
                str = "thumb_up_hashtag";
            }
            C42810Gr8 c42810Gr8 = (C42810Gr8) viewHolder;
            boolean LJIIIZ = AVCommerceServiceImpl.LJIIJ().LJIIIZ(this.LJLILLLLZI, challengeName, c42810Gr8.LJLIL, Boolean.TRUE, str);
            AVChallenge aVChallenge = c42802Gr0.LIZ;
            String str2 = this.LJLJJLL;
            int i3 = 0;
            if (i == 0 && aVChallenge.isNew(str2)) {
                c42810Gr8.LJLJI.setText(R.string.qcq);
                TextView textView = c42810Gr8.LJLJI;
                textView.setTextColor(textView.getResources().getColor(R.color.c8));
            } else {
                String LJJIIJ = C77123UOp.LJJIIJ(aVChallenge.getViewCount());
                TextView textView2 = c42810Gr8.LJLJI;
                textView2.setText(textView2.getResources().getQuantityString(R.plurals.ga, (int) aVChallenge.getViewCount(), LJJIIJ));
                TextView textView3 = c42810Gr8.LJLJI;
                textView3.setTextColor(textView3.getResources().getColor(R.color.cu));
            }
            TextView textView4 = c42810Gr8.LJLJI;
            if (!c42802Gr0.LIZLLL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView4.setVisibility(i2);
            c42810Gr8.LJLJJL.setVisibility(4);
            int i4 = c42802Gr0.LIZJ;
            ImageView imageView = c42810Gr8.LJLILLLLZI;
            if (!this.LJLJJI || i4 <= 0) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
            if (i4 > 0) {
                c42810Gr8.LJLILLLLZI.setImageResource(i4);
            }
            C16880lQ.LJIIJ(new ViewOnClickListenerC42811Gr9(this, c42802Gr0, i, LJIIIZ, str), viewHolder.itemView);
            RecommendHashTagData.AdData adData = c42802Gr0.LJ;
            if (adData != null) {
                Context context = this.LJLILLLLZI;
                HashMap hashMap = new HashMap();
                int i5 = i + 1;
                hashMap.put("topic_order", Integer.valueOf(i5));
                C59127NIl LIZ = C59128NIm.LIZ();
                LIZ.LIZ = "launch_ad";
                LIZ.LIZIZ = "show";
                LIZ.LJIIIIZZ("topic");
                LIZ.LJII(adData.logExtra);
                LIZ.LIZLLL(Long.valueOf(adData.creativeId));
                LIZ.LIZ(hashMap);
                LIZ.LJIIIZ(context);
                C58655N0h LJ = C58704N2e.LJ("launch_ad", "show", String.valueOf(adData.creativeId), adData.logExtra, CardStruct.IStatusCode.DEFAULT);
                LJ.LIZJ("topic", "refer");
                LJ.LIZIZ(Integer.valueOf(i5), "topic_order");
                LJ.LJII();
            }
            if (c42802Gr0.LIZIZ == 2) {
                ((C42810Gr8) viewHolder).LJLJJI.setOnTouchListener(new IDTListenerS116S0100000_7(viewHolder, 11));
            }
            LJLZ(c42802Gr0, i);
            return;
        }
        if (!(viewHolder instanceof C42813GrB) || c42802Gr0 == null) {
            return;
        }
        String challengeName2 = c42802Gr0.LIZ.getChallengeName();
        if (challengeName2 != null) {
            str = challengeName2;
        }
        if (!str.startsWith("#")) {
            str = i0.LJFF("#", str);
        }
        C42812GrA c42812GrA = (C42812GrA) viewHolder;
        ((C86763aq) c42812GrA.LJLIL).setTagName(str);
        c42812GrA.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0201000_7(i, c42802Gr0, this, 6)));
        LJLZ(c42802Gr0, i);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c42810Gr8;
        if (i != 2) {
            if (i != 3) {
                c42810Gr8 = null;
            } else {
                c42810Gr8 = new C42813GrB(new C86763aq(this.LJLILLLLZI));
            }
        } else {
            c42810Gr8 = new C42810Gr8(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLILLLLZI), R.layout.bc9, viewGroup, false));
        }
        C0AX.LIZ(viewGroup, c42810Gr8.itemView, R.id.lj7);
        View view = c42810Gr8.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c42810Gr8.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c42810Gr8.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c42810Gr8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c42810Gr8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c42810Gr8.getClass().getName();
        return c42810Gr8;
    }

    public C42809Gr7(WM7 wm7, List list, InterfaceC42808Gr6 interfaceC42808Gr6) {
        this.LJLJJL = (HashTagMobHelper) C165706es.LJIIIIZZ(wm7, null, null, 6).get(HashTagMobHelper.class);
        this.LJLIL = list;
        this.LJLILLLLZI = wm7.requireActivity();
        this.LJLJI = interfaceC42808Gr6;
    }

    public final void LJLLLLLL(C42802Gr0 c42802Gr0, int i, boolean z, String str) {
        String imprId;
        if (z) {
            AVCommerceServiceImpl.LJIIJ().LIZJ(str, c42802Gr0.LIZ.challengeName);
        }
        InterfaceC42808Gr6 interfaceC42808Gr6 = this.LJLJI;
        if (interfaceC42808Gr6 != null) {
            AVChallenge aVChallenge = c42802Gr0.LIZ;
            C42796Gqu c42796Gqu = (C42796Gqu) interfaceC42808Gr6;
            c42796Gqu.LIZ();
            c42796Gqu.LJLLLLLL = false;
            GSR gsr = c42796Gqu.LJLJLLL.LIZIZ;
            int selectionStart = gsr.getSelectionStart();
            if (gsr.getText() != null) {
                String substring = gsr.getText().toString().substring(0, selectionStart);
                if (C73030SlO.LJFF(substring) || substring.endsWith("#")) {
                    C41529GRp LIZIZ = C73030SlO.LIZIZ(substring, aVChallenge.getChallengeName());
                    if (LIZIZ.LIZJ != null) {
                        try {
                            gsr.getText().replace(substring.lastIndexOf("#"), selectionStart, LIZIZ.LIZJ);
                        } catch (IndexOutOfBoundsException unused) {
                        }
                        gsr.LJIJJ(true);
                        String trim = LIZIZ.LIZJ.trim();
                        if (!C73030SlO.LJFF(trim)) {
                            ((HashSet) gsr.LLFZ).add(trim);
                        }
                    }
                }
            }
        }
        RecommendHashTagData.AdData adData = c42802Gr0.LJ;
        if (adData != null) {
            Context context = this.LJLILLLLZI;
            HashMap hashMap = new HashMap();
            int i2 = i + 1;
            hashMap.put("topic_order", Integer.valueOf(i2));
            C59127NIl LIZ = C59128NIm.LIZ();
            LIZ.LIZ = "launch_ad";
            LIZ.LIZIZ = "click";
            LIZ.LJIIIIZZ("topic");
            LIZ.LJII(adData.logExtra);
            LIZ.LIZLLL(Long.valueOf(adData.creativeId));
            LIZ.LIZ(hashMap);
            LIZ.LJIIIZ(context);
            C58655N0h LJ = C58704N2e.LJ("launch_ad", "click", String.valueOf(adData.creativeId), adData.logExtra, CardStruct.IStatusCode.DEFAULT);
            LJ.LIZJ("topic", "refer");
            LJ.LIZIZ(Integer.valueOf(i2), "topic_order");
            LJ.LJII();
        }
        HashTagMobHelper hashTagMobHelper = this.LJLJJL;
        if (hashTagMobHelper != null) {
            String str2 = null;
            hashTagMobHelper.hv0("click_tag_button", c42802Gr0, Integer.valueOf(i), null);
            if (TextUtils.equals(c42802Gr0.LJFF, "search")) {
                HashTagMobHelper hashTagMobHelper2 = this.LJLJJL;
                Integer valueOf = Integer.valueOf(i);
                hashTagMobHelper2.getClass();
                if (valueOf != null) {
                    valueOf.intValue();
                    String str3 = c42802Gr0.LIZ.cid;
                    C76W c76w = new C76W();
                    c76w.LIZ("words_content", c42802Gr0.LIZ.challengeName);
                    c76w.LIZ("words_position", valueOf.toString());
                    c76w.LIZ("words_source", "sug");
                    c76w.LIZ("search_position", "challenge_create");
                    c76w.LIZ("raw_query", hashTagMobHelper2.LJLJJI);
                    c76w.LIZ("rank", "-1");
                    RecommendWordMob recommendWordMob = hashTagMobHelper2.LJLJI;
                    if (recommendWordMob != null) {
                        str2 = recommendWordMob.getQueryId();
                    }
                    c76w.LIZ("query_id", str2);
                    c76w.LIZ("group_id", str3);
                    LogPbBean logPbBean = hashTagMobHelper2.LJLILLLLZI;
                    if (logPbBean == null) {
                        imprId = "";
                    } else {
                        imprId = logPbBean.getImprId();
                    }
                    c76w.LIZ("impr_id", imprId);
                    FMX.LJIILJJIL("trending_words_click", c76w.LIZIZ());
                }
            }
        }
    }
}
