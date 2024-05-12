package X;

import Y.ACListenerS28S0100000_8;
import Y.ACListenerS8S0500000_8;
import Y.ARunnableS23S0200000_4;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS40S0100000_4;
import Y.ARunnableS44S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.ECommerceGeneralSearchWidgetServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JL4 extends JL6 implements InterfaceC50036JkO {
    public static final int LLF;
    public final JIB LJLJLJ;
    public final C49153JQv LJLJLLL;
    public final RecyclerView LJLL;
    public final int LJLLI;
    public final String LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public boolean LJZI;
    public final C62822Ol8 LJZL;
    public List<? extends Aweme> LL;
    public final InterfaceC49154JQw LLD;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return 1;
    }

    static {
        int intValue;
        C62822Ol8 c62822Ol8 = DYI.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 0) {
            intValue = 10;
        } else {
            intValue = ((Number) c62822Ol8.getValue()).intValue();
        }
        LLF = intValue;
    }

    public final LinkedHashMap<String, OSZ<Aweme, Integer>> LJZI() {
        return (LinkedHashMap) this.LJLLJ.getValue();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (this.LL.size() == 1) {
            return 1;
        }
        return this.LL.size();
    }

    @Override // X.JLX
    public final List<Aweme> LJLLLLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC50036JkO
    public final void LJLLJ(String str) {
        OSZ<Aweme, Integer> osz;
        boolean z;
        LinearLayoutManager linearLayoutManager;
        JSL LJFF;
        int size;
        int i;
        if (this.LL.size() > 1 && (osz = LJZI().get(str)) != null) {
            int intValue = osz.getSecond().intValue();
            int i2 = this.LJLLLL;
            if (intValue <= this.LJLLLLLL && i2 <= intValue) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i3 = LLF;
                int i4 = (intValue - i3) + 1;
                if (i4 < 0) {
                    intValue = Math.min(i3 - 1, LJZI().size() - 1);
                    i4 = 0;
                }
                Collection<OSZ<Aweme, Integer>> values = LJZI().values();
                o.LJIIIIZZ(values, "fullAwemeMap.values");
                List LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJLL(ORZ.LJLIIIL(values), JLB.LJLIL)));
                int i5 = intValue + 1;
                if (!LJJIJLIJ.isEmpty() && i4 <= (size = LJJIJLIJ.size() - 1) && i5 - 1 >= 0 && i <= size && i4 < i5) {
                    LJJIJLIJ = LJJIJLIJ.subList(i4, i5);
                }
                JL6.LJZ(this, LJJIJLIJ, null, null, 6);
            }
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = -1;
            int i6 = 0;
            for (Aweme aweme : this.LL) {
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    if (o.LJ(aweme.getAid(), str)) {
                        c76732zl.element = i6;
                    }
                    i6 = i7;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            C0A2 layoutManager = this.LJLL.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                if (C46447IKt.LJLJLJ && this.LJZI) {
                    Taco taco = (Taco) this.LJZ.getValue();
                    if (taco != null && (LJFF = taco.LJFF(18)) != null) {
                        LJFF.LIZIZ(c76732zl.element, null);
                        return;
                    }
                    return;
                }
                this.LJLJLLL.LJIIJ = true;
                linearLayoutManager.LJFF(c76732zl.element, 0);
                linearLayoutManager.LLJJIJIIJIL(true);
                this.LJLL.postDelayed(new ARunnableS27S0200000_8(c76732zl, this, 58), 500L);
            }
        }
    }

    public final void LJZL(List<? extends Aweme> list) {
        Integer num;
        for (Aweme aweme : list) {
            if (aweme.getAid() != null && !LJZI().containsKey(aweme.getAid())) {
                LinkedHashMap<String, OSZ<Aweme, Integer>> LJZI = LJZI();
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "it.aid");
                LJZI.put(aid, new OSZ<>(aweme, Integer.valueOf(((AtomicInteger) this.LJLLL.getValue()).getAndIncrement())));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("storeToFullMap, totalSize: ");
        LinkedHashMap<String, OSZ<Aweme, Integer>> LJZI2 = LJZI();
        if (LJZI2 != null) {
            num = Integer.valueOf(LJZI2.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", lastIndex: ");
        LIZ.append(((AtomicInteger) this.LJLLL.getValue()).get());
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC50036JkO
    public final boolean ab(String str) {
        return LJZI().containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [X.Ynr, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v20 */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        JQA jqa;
        String str;
        String str2;
        String str3;
        int i2;
        UrlModel urlModel;
        int LIZ;
        ConstraintLayout constraintLayout;
        Integer num;
        CharSequence text;
        int LIZIZ;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        TuxTextView tuxTextView;
        int i3;
        Integer valueOf;
        int i4;
        int i5;
        IExtendedTopLiveProductView iExtendedTopLiveProductView;
        Aweme aweme;
        List<Product> productsInfo;
        IExtendedTopLiveProductView iExtendedTopLiveProductView2;
        IExtendedTopLiveProductView iExtendedTopLiveProductView3;
        JJ2 jj2;
        int i6;
        UrlModel urlModel2;
        Boolean bool;
        LiveRoomStruct newLiveRoomData;
        TuxTextView tuxTextView2;
        TopFrameSummary topFrameSummary;
        int i7;
        TuxTextView tuxTextView3;
        TuxTextView tuxTextView4;
        String roomTitle;
        UrlModel urlModel3;
        String str4;
        Long l;
        String str5;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (!(viewHolder instanceof JKG)) {
            return;
        }
        Aweme aweme2 = (Aweme) ListProtector.get(this.LL, i);
        JL8 jl8 = (JL8) ListProtector.get(this.LJLJL, i);
        JKG jkg = (JKG) viewHolder;
        jkg.LJLJL = this.LJLJI;
        String docId = this.LJLJJI;
        JL9 jl9 = this.LJLJJLL;
        float floatValue = ((Number) this.LJLZ.getValue()).floatValue();
        o.LJIIIZ(docId, "docId");
        o.LJIIIZ(aweme2, "aweme");
        if (jl9 != null) {
            jqa = jl9.LIZIZ;
        } else {
            jqa = null;
        }
        boolean z = true;
        if (jqa != null) {
            SearchCardInfo searchCardInfo = jl9.LIZ;
            if (searchCardInfo == null || (str5 = searchCardInfo.alasrc) == null || str5.length() == 0) {
                str4 = "live_card";
            } else {
                SearchCardInfo searchCardInfo2 = jl9.LIZ;
                if (searchCardInfo2 == null || (str4 = searchCardInfo2.alasrc) == null) {
                    str4 = "";
                }
            }
            jqa.LJIJJLI = str4;
            User author = aweme2.getAuthor();
            if (author != null) {
                l = Long.valueOf(C78934UyQ.LJIILJJIL(author));
            } else {
                l = null;
            }
            jqa.LJIILL = String.valueOf(l);
        }
        User author2 = aweme2.getAuthor();
        if (author2 != null && (urlModel3 = author2.roomCover) != null) {
            urlModel3.getUri();
        }
        jkg.LLII = aweme2;
        C48881JGj v = jkg.v();
        if (v != null) {
            v.LJIJJLI = jqa;
        }
        C48881JGj v2 = jkg.v();
        if (v2 != null) {
            v2.LJII(docId);
        }
        C48912JHo LLLIIII = jkg.LLLIIII();
        if (LLLIIII != null) {
            LLLIIII.LJFF = jkg.getPosition();
        }
        C48936JIm c0 = jkg.c0();
        o.LJI(jqa);
        c0.LJIIIIZZ(aweme2, jqa);
        ViewGroup.LayoutParams layoutParams = jkg.a0().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        User author3 = aweme2.getAuthor();
        if (author3 == null || (roomTitle = author3.getRoomTitle()) == null || !ujb.o.LJJJJJL(roomTitle)) {
            z = false;
        }
        if (z) {
            jkg.f0().setVisibility(8);
            marginLayoutParams.topMargin = (int) KL2.LIZJ(jkg.itemView.getContext(), 8.0f);
        } else {
            marginLayoutParams.topMargin = (int) KL2.LIZJ(jkg.itemView.getContext(), 4.0f);
            TextView f0 = jkg.f0();
            C116724i4 c116724i4 = new C116724i4();
            User author4 = aweme2.getAuthor();
            if (author4 == null || (str = author4.getRoomTitle()) == null) {
                str = "";
            }
            c116724i4.LIZLLL(str);
            f0.setText(c116724i4.LIZ);
            jkg.f0().setVisibility(0);
        }
        C97N.LIZ.getClass();
        if (C97N.LIZ()) {
            marginLayoutParams.width = C7MY.LIZIZ(20);
            marginLayoutParams.height = C7MY.LIZIZ(20);
            if (jkg.w0()) {
                TextView g0 = jkg.g0();
                if (g0 instanceof TuxTextView) {
                    tuxTextView3 = (TuxTextView) g0;
                } else {
                    tuxTextView3 = null;
                }
                if (tuxTextView3 != null) {
                    tuxTextView3.setTuxFont(61);
                }
                C34472Dfw.LIZ.getClass();
                if (C34472Dfw.LIZ()) {
                    TextView textView = (TextView) jkg.LJZL.getValue();
                    if ((textView instanceof TuxTextView) && (tuxTextView4 = (TuxTextView) textView) != null) {
                        tuxTextView4.setTuxFont(61);
                    }
                }
            }
        }
        C49098JOs.LIZ.getClass();
        Integer num2 = 0;
        if (num2.intValue() > 0) {
            int intValue = num2.intValue();
            if (jkg.w0()) {
                if (jkg.f0().getVisibility() == 0) {
                    C26338AVi.LJI(jkg.f0(), null, AnonymousClass391.LIZJ(intValue), null, null, false, 29);
                }
                marginLayoutParams.topMargin = C7MY.LIZIZ(intValue);
            }
        }
        C34472Dfw.LIZ.getClass();
        if (C34472Dfw.LIZ() && !jkg.w0()) {
            View view = (View) jkg.LLD.getValue();
            if (view != null) {
                view.setVisibility(0);
            }
            TextView textView2 = (TextView) jkg.LLD.getValue();
            if (textView2 != null) {
                textView2.setText("·");
            }
        } else {
            View view2 = (View) jkg.LLD.getValue();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        jkg.a0().setLayoutParams(marginLayoutParams);
        TextView g02 = jkg.g0();
        User author5 = aweme2.getAuthor();
        if (author5 != null) {
            str2 = author5.getSearchUserName();
        } else {
            str2 = null;
        }
        g02.setText(str2);
        LiveRoomStruct newLiveRoomData2 = aweme2.getNewLiveRoomData();
        if (newLiveRoomData2 == null || (str3 = newLiveRoomData2.getUserCountDes()) == null) {
            str3 = "";
        }
        LiveRoomStruct newLiveRoomData3 = aweme2.getNewLiveRoomData();
        if (newLiveRoomData3 != null) {
            i2 = newLiveRoomData3.user_count;
        } else {
            i2 = 0;
        }
        jkg.LLIIIJ = i2;
        LiveRoomStruct newLiveRoomData4 = aweme2.getNewLiveRoomData();
        if (newLiveRoomData4 != null && (topFrameSummary = newLiveRoomData4.topFrameSummary) != null && topFrameSummary.getId() != 0) {
            LiveRoomStruct newLiveRoomData5 = aweme2.getNewLiveRoomData();
            if (newLiveRoomData5 == null || (str3 = newLiveRoomData5.getTotalUserDes()) == null) {
                str3 = "";
            }
            LiveRoomStruct newLiveRoomData6 = aweme2.getNewLiveRoomData();
            if (newLiveRoomData6 != null) {
                i7 = newLiveRoomData6.total_user;
            } else {
                i7 = 0;
            }
            jkg.LLIIIJ = i7;
        }
        ((TextView) jkg.LJZL.getValue()).setText(str3);
        JJC.LIZ.getClass();
        if (JJC.LIZ()) {
            TextView textView3 = (TextView) jkg.LJLLLL.getValue();
            if ((textView3 instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) textView3) != null) {
                tuxTextView2.setTuxFont(82);
            }
            if (C34472Dfw.LIZ()) {
                jkg.Y().getLayoutParams().height = C7MY.LIZIZ(16);
            }
        }
        Aweme aweme3 = jkg.LLII;
        if (aweme3 != null && (newLiveRoomData = aweme3.getNewLiveRoomData()) != null && newLiveRoomData.liveEventInfo != null) {
            TextView textView4 = (TextView) jkg.LJLLLL.getValue();
            LiveOuterService.LJJJLL().LJJIIJ();
            textView4.setText(C38957FQr.LIZ(jkg.itemView.getContext(), "pm_mt_live_events_live_consumer_live_events"));
        } else {
            ((TextView) jkg.LJLLLL.getValue()).setText(jkg.itemView.getContext().getResources().getString(R.string.mx3));
        }
        ITopLiveProductViewProvider iTopLiveProductViewProvider = (ITopLiveProductViewProvider) jkg.LLI.getValue();
        if (iTopLiveProductViewProvider != null) {
            boolean w0 = jkg.w0();
            LinearLayout linearLayout = (LinearLayout) jkg.itemView.findViewById(R.id.gb3);
            Aweme aweme4 = jkg.LLII;
            if (aweme4 != null) {
                bool = Boolean.valueOf(aweme4.getIsLiveHasProduct());
            } else {
                bool = null;
            }
            iTopLiveProductViewProvider.addBagIconIfNeed(w0, linearLayout, bool);
        }
        SmartImageView N = jkg.N();
        User author6 = aweme2.getAuthor();
        if (author6 != null && (urlModel2 = author6.roomCover) != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel2));
            LJII.LJJIIJ = N;
            C16880lQ.LLJJJ(LJII);
        }
        if (jkg.w0()) {
            jkg.itemView.setOutlineProvider((ViewOutlineProvider) jkg.LLFFF.getValue());
            View findViewById = jkg.itemView.findViewById(R.id.deh);
            if (findViewById != null) {
                C1JI.LJJIIZ(findViewById, Float.valueOf(KL2.LIZJ(jkg.itemView.getContext(), jkg.h0())), null, null, null, null, 30);
            }
        } else {
            jkg.itemView.setOutlineProvider((ViewOutlineProvider) jkg.LLFZ.getValue());
        }
        User author7 = aweme2.getAuthor();
        if (author7 != null) {
            urlModel = author7.getAvatarThumb();
        } else {
            urlModel = null;
        }
        W5F LJII2 = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII2.LJIILIIL(J7H.LIZ(100));
        LJII2.LIZIZ("AbsCellViewHolder");
        if (C34127DaN.LJFF()) {
            Integer LIZIZ2 = C19N.LIZIZ(jkg.itemView, "itemView.context", R.attr.cj);
            if (LIZIZ2 != null) {
                i6 = LIZIZ2.intValue();
            } else {
                i6 = 0;
            }
            LJII2.LJIILIIL = new ColorDrawable(i6);
        }
        LJII2.LJJIIJ = jkg.a0();
        LJII2.LJ();
        View itemView = jkg.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        Context context = jkg.itemView.getContext();
        ViewGroup.LayoutParams layoutParams2 = itemView.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        o.LJIIIIZZ(context, "context");
        int LJJII = C32151Nz.LJJII(context);
        if (jkg.w0()) {
            if (jkg.w0()) {
                jj2 = JLE.LIZJ;
            } else {
                jj2 = JLD.LIZJ;
            }
            marginLayoutParams2.width = jj2.LIZ;
            marginLayoutParams2.height = (int) floatValue;
        } else {
            float f = LJJII;
            if (f < KL2.LIZJ(context, 375.0f)) {
                marginLayoutParams2.width = C278817o.LIZ(200.0f);
                JKI.LIZ.getClass();
                if (JKI.LIZ()) {
                    LIZ = C278817o.LIZ(320.0f);
                } else {
                    LIZ = C278817o.LIZ(356.0f);
                }
                marginLayoutParams2.height = LIZ;
            } else {
                float f2 = f * 0.53333336f;
                marginLayoutParams2.width = (int) f2;
                JKI.LIZ.getClass();
                if (JKI.LIZ()) {
                    marginLayoutParams2.height = (int) (f2 * 1.6f);
                } else {
                    marginLayoutParams2.height = (int) (f2 * jkg.LLIFFJFJJ);
                }
            }
        }
        int LIZJ = (int) KL2.LIZJ(jkg.itemView.getContext(), 8.0f);
        Integer valueOf2 = Integer.valueOf(C49098JOs.LJ());
        if (valueOf2.intValue() > 0) {
            LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(valueOf2.intValue())));
        }
        ViewGroup.LayoutParams layoutParams3 = jkg.itemView.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginEnd(LIZJ);
        itemView.setLayoutParams(marginLayoutParams2);
        if (jkg.T()) {
            if (jl8 != null && (aweme = jl8.LJLIL) != null && (productsInfo = aweme.getProductsInfo()) != null && productsInfo.size() > 0) {
                LinearLayout m0 = jkg.m0();
                if (m0 != null) {
                    m0.setVisibility(0);
                }
                if (!jkg.w0()) {
                    jkg.f0().setVisibility(8);
                }
                if (jkg.l0() instanceof IExtendedTopLiveProductView) {
                    ITopLiveProductView l0 = jkg.l0();
                    if ((l0 instanceof IExtendedTopLiveProductView) && (iExtendedTopLiveProductView3 = (IExtendedTopLiveProductView) l0) != null) {
                        iExtendedTopLiveProductView3.setLiveProductSearchAbility(new JL5(jl8, jkg, jl9, this));
                    }
                    ITopLiveProductView l02 = jkg.l0();
                    if ((l02 instanceof IExtendedTopLiveProductView) && (iExtendedTopLiveProductView2 = (IExtendedTopLiveProductView) l02) != null) {
                        iExtendedTopLiveProductView2.bindExtraProductData(jl9, jkg.c0().getLivePlayerTag(), jkg.getLayoutPosition(), jkg.itemView.getContext());
                    }
                }
                jkg.LLIIIILZ = true;
            } else {
                LinearLayout m02 = jkg.m0();
                if (m02 != null) {
                    m02.setVisibility(8);
                }
                jkg.f0().setVisibility(0);
                TextView g03 = jkg.g0();
                if (C46314IFq.LIZIZ()) {
                    i5 = 131;
                } else {
                    i5 = 155;
                }
                g03.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i5))));
                jkg.LLIIIILZ = false;
                if (jkg.l0() instanceof IExtendedTopLiveProductView) {
                    ITopLiveProductView l03 = jkg.l0();
                    if ((l03 instanceof IExtendedTopLiveProductView) && (iExtendedTopLiveProductView = (IExtendedTopLiveProductView) l03) != null) {
                        iExtendedTopLiveProductView.setLiveProductSearchAbility(null);
                    }
                }
            }
            if (jkg.LLIIIILZ && !jkg.LLIIJI) {
                jkg.LLIIJI = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("entrance_form", jkg.U());
                FMX.LJIILJJIL("rd_ec_product_entrance_will_show", jSONObject);
            }
            ITopLiveProductView l04 = jkg.l0();
            if (l04 != null) {
                l04.bindProductData(jl8);
            }
        }
        if (C72704Sg8.LIZIZ(jkg.itemView, "itemView.context")) {
            jkg.Y().setBackgroundResource(R.drawable.c1_);
            jkg.o0().setBackgroundResource(R.drawable.c1b);
        } else {
            jkg.Y().setBackgroundResource(R.drawable.c18);
            jkg.o0().setBackgroundResource(R.drawable.c1a);
        }
        if (C34472Dfw.LIZ()) {
            jkg.o0().setBackgroundResource(0);
            TuxIconView tuxIconView = (TuxIconView) jkg.LL.getValue();
            C2068389v c2068389v = new C2068389v();
            if (C97N.LIZ() && jkg.w0()) {
                i3 = R.raw.icon_person;
            } else {
                i3 = R.raw.icon_person_bold;
            }
            c2068389v.LIZ = i3;
            if (jkg.w0()) {
                valueOf = Integer.valueOf(R.attr.gx);
            } else {
                valueOf = Integer.valueOf(R.attr.dj);
            }
            c2068389v.LJ = valueOf;
            tuxIconView.setTuxIcon(c2068389v);
            ((View) jkg.LL.getValue()).getLayoutParams().width = C7MY.LIZIZ(14);
            ((View) jkg.LL.getValue()).getLayoutParams().height = C7MY.LIZIZ(14);
            Integer num3 = (Integer) jkg.LLF.getValue();
            if (num3 != null) {
                i4 = num3.intValue();
            } else {
                i4 = 3;
            }
            float LJIIZILJ = C32151Nz.LJIIZILJ(Integer.valueOf(i4));
            C79043V0l.LJIJI(jkg.Y(), LJIIZILJ, LJIIZILJ, LJIIZILJ, LJIIZILJ);
        } else {
            Number number = (Number) jkg.LLF.getValue();
            if (number != null) {
                float LJIIZILJ2 = C32151Nz.LJIIZILJ(number);
                if (C72704Sg8.LIZIZ(jkg.itemView, "itemView.context")) {
                    C79043V0l.LJIJI(jkg.Y(), 0.0f, LJIIZILJ2, LJIIZILJ2, 0.0f);
                    C79043V0l.LJIJI(jkg.o0(), LJIIZILJ2, 0.0f, 0.0f, LJIIZILJ2);
                } else {
                    C79043V0l.LJIJI(jkg.Y(), LJIIZILJ2, 0.0f, 0.0f, LJIIZILJ2);
                    C79043V0l.LJIJI(jkg.o0(), 0.0f, LJIIZILJ2, LJIIZILJ2, 0.0f);
                }
            }
        }
        if (C34472Dfw.LIZ()) {
            ViewParent parent = jkg.o0().getParent();
            if ((parent instanceof ConstraintLayout) && (constraintLayout3 = (ConstraintLayout) parent) != null) {
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(constraintLayout3);
                anonymousClass064.LJI(R.id.gb5, 6);
                anonymousClass064.LJIIIZ(R.id.gb5, 3, R.id.mzt, 3, 0);
                anonymousClass064.LJIIIIZZ(R.id.gb5, 4, R.id.mzt, 4);
                if (jkg.w0()) {
                    anonymousClass064.LJIIIIZZ(R.id.gb5, 7, 0, 7);
                    anonymousClass064.LJIIIZ(R.id.mzt, 7, R.id.gb5, 6, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                    jkg.o0().setPaddingRelative(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0);
                    TextView textView5 = (TextView) jkg.LJZL.getValue();
                    if ((textView5 instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView5) != null) {
                        tuxTextView.setTextColorRes(R.attr.gx);
                    }
                } else {
                    anonymousClass064.LJIIIIZZ(R.id.gb5, 6, R.id.mzt, 7);
                    jkg.o0().post(new ARunnableS40S0100000_4(jkg, 97));
                }
                anonymousClass064.LIZIZ(constraintLayout3);
            }
            JJ8.LIZ.getClass();
            if (JJ8.LIZ()) {
                ViewParent parent2 = jkg.Y().getParent();
                if ((parent2 instanceof ConstraintLayout) && (constraintLayout2 = (ConstraintLayout) parent2) != null) {
                    AnonymousClass064 anonymousClass0642 = new AnonymousClass064();
                    anonymousClass0642.LJII(constraintLayout2);
                    anonymousClass0642.LJI(R.id.gb3, 6);
                    anonymousClass0642.LJIIIZ(R.id.gb3, 7, 0, 7, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                    anonymousClass0642.LIZIZ(constraintLayout2);
                }
            }
        } else {
            JJ8.LIZ.getClass();
            if (JJ8.LIZ()) {
                ViewParent parent3 = jkg.o0().getParent();
                if ((parent3 instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent3) != null) {
                    AnonymousClass064 anonymousClass0643 = new AnonymousClass064();
                    anonymousClass0643.LJII(constraintLayout);
                    anonymousClass0643.LJI(R.id.gb5, 6);
                    anonymousClass0643.LJIIIZ(R.id.gb5, 7, 0, 7, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                    anonymousClass0643.LJI(R.id.gb3, 6);
                    anonymousClass0643.LJIIIIZZ(R.id.gb3, 7, R.id.gb5, 6);
                    anonymousClass0643.LIZIZ(constraintLayout);
                }
            }
        }
        jkg.t0("search_result_show", aweme2, jqa);
        jkg.t0("livesdk_live_show", aweme2, jqa);
        ACListenerS8S0500000_8 aCListenerS8S0500000_8 = new ACListenerS8S0500000_8(jkg, aweme2, jl9, this, jqa, 1);
        jkg.c0().setOnClickListener(new ViewOnClickListenerC13880ga(aCListenerS8S0500000_8));
        if (jkg.w0()) {
            C16880lQ.LJJIJL(jkg.a0(), aCListenerS8S0500000_8);
            C16880lQ.LJIJI(jkg.f0(), aCListenerS8S0500000_8);
            C16880lQ.LJIJI(jkg.g0(), aCListenerS8S0500000_8);
        }
        jkg.c0().getLiveCore().setLivePlayerEntranceParam(new C51093K3l("general_search", "live_cell", ""));
        JYG X2 = jkg.X(aweme2, jl9);
        jkg.LJLJJLL = jkg.w0();
        jkg.LJLJJL = true;
        jkg.L(jkg.c0(), X2, new IDTListenerS117S0100000_8(jkg, 6));
        if (jkg.w0()) {
            num = 0;
            jkg.L(jkg.a0(), null, new IDTListenerS117S0100000_8(jkg, 7));
            jkg.L(jkg.f0(), null, new IDTListenerS117S0100000_8(jkg, 8));
            jkg.L(jkg.g0(), null, new IDTListenerS117S0100000_8(jkg, 9));
        } else {
            num = 0;
        }
        JON n0 = jkg.n0();
        if (n0 != null) {
            C78897Uxp.LJJJJLI(n0, num);
        }
        jkg.LLIIJLIL = jqa;
        JON n02 = jkg.n0();
        if (n02 != null) {
            C16880lQ.LJJJLZIJ(n02, new ACListenerS28S0100000_8(jkg, 61));
        }
        JON n03 = jkg.n0();
        if (n03 != null) {
            n03.setVisibility(8);
        }
        if (jkg.w0() && C46314IFq.LIZIZ()) {
            jkg.p0().setVisibility(0);
        }
        if (!jkg.w0()) {
            jkg.p0().setVisibility(8);
            LinearLayout m03 = jkg.m0();
            if (m03 != null && m03.getVisibility() == 0) {
                LinearLayout m04 = jkg.m0();
                if (m04 != null) {
                    m04.post(new ARunnableS23S0200000_4(jkg, m04, 25));
                }
            } else if (jkg.f0().getVisibility() != 0 || (text = jkg.f0().getText()) == null || text.length() == 0) {
                if (jkg.a0().getVisibility() == 0) {
                    jkg.a0().post(new ARunnableS40S0100000_4(jkg, 99));
                }
            } else {
                jkg.f0().post(new ARunnableS40S0100000_4(jkg, 98));
            }
        }
        JON n04 = jkg.n0();
        if (n04 != null) {
            if (C97N.LIZ()) {
                LIZIZ = 0;
            } else {
                LIZIZ = C7MY.LIZIZ(2);
            }
            C26338AVi.LJI(n04, num, num, num, Integer.valueOf(LIZIZ), false, 23);
        }
        boolean z2 = C46447IKt.LJLJLJ;
        if (z2) {
            jkg.LJLLILLLL = (JLF) this.LJZL.getValue();
        }
        if (i == 0 && z2 && C34470Dfu.LIZIZ() != 1 && C34470Dfu.LIZIZ() != 3) {
            viewHolder.itemView.post(new ARunnableS44S0100000_8(this, 89));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        boolean z;
        int i2;
        View view;
        K22 LIZIZ;
        o.LJIIIZ(parent, "parent");
        JIB provider = this.LJLJLJ;
        C49153JQv scrollStateManager = this.LJLJLLL;
        int i3 = this.LJLLI;
        String alaSource = this.LJLLILLLL;
        o.LJIIIZ(provider, "provider");
        o.LJIIIZ(scrollStateManager, "scrollStateManager");
        o.LJIIIZ(alaSource, "alaSource");
        boolean LIZ = C49129JPx.LIZ(i3, alaSource);
        boolean LIZ2 = C34470Dfu.LIZ(i3);
        boolean z2 = true;
        if (LIZ || LIZ2) {
            z = true;
            i2 = R.layout.cez;
        } else {
            z = false;
            i2 = R.layout.cey;
        }
        View LIZIZ2 = C50365Jph.LIZIZ(i2, parent);
        ViewGroup viewGroup = (ViewGroup) LIZIZ2.findViewById(R.id.i60);
        if (viewGroup != null) {
            IECommerceGeneralSearchWidgetService LIZJ = ECommerceGeneralSearchWidgetServiceImpl.LIZJ();
            Object obj = null;
            if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ()) != null) {
                obj = LIZIZ.getTopLiveProductView(viewGroup, z);
            }
            if ((obj instanceof View) && (view = (View) obj) != null) {
                viewGroup.addView(view);
            }
        }
        JKG jkg = new JKG(LIZIZ2, provider, scrollStateManager, this, parent, i3, alaSource);
        C0AX.LIZ(parent, jkg.itemView, R.id.lj7);
        View view2 = jkg.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (jkg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z2 = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z2) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(JKG.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) jkg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(jkg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = JKG.class.getName();
        return jkg;
    }

    @Override // X.InterfaceC50036JkO
    public final void hb(SearchLiveList searchLiveList, List<? extends Aweme> awemeList, boolean z) {
        o.LJIIIZ(awemeList, "awemeList");
        LJZL(awemeList);
        JL9 jl9 = this.LJLJJLL;
        if (jl9 != null) {
            Collection<OSZ<Aweme, Integer>> values = LJZI().values();
            o.LJIIIIZZ(values, "fullAwemeMap.values");
            ArrayList arrayList = new ArrayList(C32I.LJJL(values, 10));
            Iterator<OSZ<Aweme, Integer>> it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFirst());
            }
            jl9.LIZJ = arrayList;
        }
        JL9 jl92 = this.LJLJJLL;
        if (jl92 == null) {
            return;
        }
        jl92.LIZLLL = searchLiveList.cursor;
    }

    @Override // X.JL6
    public final void LJLZ(List<? extends Aweme> list, SearchCardInfo searchCardInfo, Long l, boolean z) {
        int i;
        long j;
        o.LJIIIZ(list, "list");
        if (z) {
            this.LJLJJLL = null;
            LJZI().clear();
            ((AtomicInteger) this.LJLLL.getValue()).set(0);
        }
        this.LL = list;
        if (LJZI().isEmpty()) {
            LJZL(list);
        }
        OSZ<Aweme, Integer> osz = LJZI().get(((Aweme) ListProtector.get(list, 0)).getAid());
        int i2 = -1;
        if (osz != null) {
            i = osz.getSecond().intValue();
        } else {
            i = -1;
        }
        this.LJLLLL = i;
        OSZ<Aweme, Integer> osz2 = LJZI().get(((Aweme) C64504PTg.LIZIZ(list, -1, list)).getAid());
        if (osz2 != null) {
            i2 = osz2.getSecond().intValue();
        }
        this.LJLLLLLL = i2;
        ((ArrayList) this.LJLJL).clear();
        for (Aweme aweme : list) {
            ((ArrayList) this.LJLJL).add(new JL8(aweme));
        }
        if (this.LJLJJLL == null) {
            JQA jqa = this.LJLJJL;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            this.LJLJJLL = new JL9(searchCardInfo, jqa, list, j);
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JL4(JIB containerStatusProvider, C49153JQv scrollStateManager, RecyclerView rv, int i, String alaSource) {
        super(rv);
        InterfaceC49154JQw interfaceC49154JQw;
        o.LJIIIZ(containerStatusProvider, "containerStatusProvider");
        o.LJIIIZ(scrollStateManager, "scrollStateManager");
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(alaSource, "alaSource");
        this.LJLJLJ = containerStatusProvider;
        this.LJLJLLL = scrollStateManager;
        this.LJLL = rv;
        this.LJLLI = i;
        this.LJLLILLLL = alaSource;
        this.LJLLJ = C221108m2.LIZIZ(JL7.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(JLC.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 495));
        this.LJZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 493));
        this.LJZL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 494));
        this.LL = new ArrayList();
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 492));
        if (C49129JPx.LIZ(i, alaSource) || C34470Dfu.LIZ(i)) {
            JLM jlm = new JLM(rv);
            jlm.LJFF = new JLS(rv);
            jlm.LJIIJJI(((ILynxSearchHorizontal.ActiveArea) LIZIZ.getValue()).getX(), ((ILynxSearchHorizontal.ActiveArea) LIZIZ.getValue()).getY(), ((ILynxSearchHorizontal.ActiveArea) LIZIZ.getValue()).getWidth(), ((ILynxSearchHorizontal.ActiveArea) LIZIZ.getValue()).getHeight());
            interfaceC49154JQw = jlm;
        } else {
            interfaceC49154JQw = new JLK(rv, scrollStateManager);
        }
        scrollStateManager.LJIIIIZZ = interfaceC49154JQw;
        this.LLD = interfaceC49154JQw;
    }
}
