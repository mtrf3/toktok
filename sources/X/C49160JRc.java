package X;

import Y.ARunnableS27S0200000_8;
import Y.ARunnableS3S0001000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.CardDate;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.LynxSearchHorizontalCardData;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JRc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49160JRc extends JLX {
    public final Context LJLJJI;
    public JRE LJLJJL;
    public boolean LJLJJLL;
    public ILynxSearchHorizontal.HorizontalStyle LJLJL;
    public int LJLJLJ;
    public final java.util.Map<String, Integer> LJLJLLL;
    public List<C49164JRg> LJLL;
    public final java.util.Map<Integer, String> LJLLI;
    public List<? extends Aweme> LJLLILLLL;
    public C49172JRo LJLLJ;
    public AqS174S0100000_8 LJLLL;

    @Override // X.JLX, X.JGU
    public final void LJJJLZIJ() {
    }

    @Override // X.JLX, X.JGU
    public final void LJLLL(Aweme aweme) {
    }

    public final List<Aweme> LJZ() {
        List<? extends Aweme> list = this.LJLLILLLL;
        if (list != null) {
            o.LJI(list);
            if (!list.isEmpty()) {
                List list2 = this.LJLLILLLL;
                o.LJI(list2);
                return list2;
            }
        }
        return new ArrayList();
    }

    @Override // X.JLX, X.InterfaceC49115JPj
    public final void contextPause() {
        if (this.LJLIL.getLayoutManager() == null || this.LJLIL.getChildCount() <= 0) {
            return;
        }
        LJLZ(C49165JRh.LJLIL);
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLL.size() + (this.LJLJJLL ? 1 : 0);
    }

    @Override // X.JLX, X.InterfaceC49115JPj
    public final void pauseAll() {
        if (this.LJLIL.getLayoutManager() == null || this.LJLIL.getChildCount() <= 0) {
            return;
        }
        LJLZ(C49166JRi.LJLIL);
    }

    public final void LJLZ(InterfaceC88472Yns<? super JSE, ? extends Object> interfaceC88472Yns) {
        JSE jse;
        List<Integer> list;
        JRE jre = this.LJLJJL;
        if (jre != null && (jse = jre.LIZ) != null && (list = jse.LIZJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                JSE LIZ = C49995Jjj.LIZ.LIZ(((Number) it.next()).intValue());
                if (LIZ != null) {
                    interfaceC88472Yns.invoke(LIZ);
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        LynxSearchHorizontalCardData lynxSearchHorizontalCardData;
        String cardName;
        Integer num;
        if ((this.LJLJJLL && i == this.LJLL.size() && i - 1 >= 0) || (lynxSearchHorizontalCardData = ((C49164JRg) ListProtector.get(this.LJLL, i)).LIZ) == null || (cardName = lynxSearchHorizontalCardData.getCardName()) == null) {
            return -1;
        }
        if (((HashMap) this.LJLJLLL).containsKey(cardName) && (num = (Integer) ((HashMap) this.LJLJLLL).get(cardName)) != null) {
            return num.intValue();
        }
        int i2 = this.LJLJLJ + 1;
        this.LJLJLJ = i2;
        ((HashMap) this.LJLJLLL).put(cardName, Integer.valueOf(i2));
        return i2;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        String str = (String) ((HashMap) this.LJLLI).get(Integer.valueOf(holder.hashCode()));
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            JHV LIZ = JHP.LIZ(str);
            LIZ.getClass();
            if (o.LJ(LIZ, JHW.LIZ)) {
                return;
            }
            LIZ.LIZLLL = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String str;
        int i3;
        String str2;
        JSP P;
        List<JSR> list;
        Object obj;
        Aweme aweme;
        Integer height;
        CardDate cardData;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (this.LJLJJLL && i == this.LJLL.size()) {
            JSH jsh = (JSH) viewHolder;
            jsh.itemView.post(new ARunnableS27S0200000_8(this.LJLJL, jsh, 46));
            return;
        }
        JVW.LIZIZ(i);
        LynxSearchHorizontalCardData lynxSearchHorizontalCardData = ((C49164JRg) ListProtector.get(this.LJLL, i)).LIZ;
        if (lynxSearchHorizontalCardData != null && (cardData = lynxSearchHorizontalCardData.getCardData()) != null) {
            i2 = cardData.getAwemeIndex();
        } else {
            i2 = i;
        }
        C49164JRg c49164JRg = (C49164JRg) ListProtector.get(this.LJLL, i);
        c49164JRg.getClass();
        DynamicPatch dynamicPatch = new DynamicPatch();
        C1HQ c1hq = new C1HQ();
        LynxSearchHorizontalCardData lynxSearchHorizontalCardData2 = c49164JRg.LIZ;
        if (lynxSearchHorizontalCardData2 != null && lynxSearchHorizontalCardData2.getRawData() != null) {
            JavaOnlyMap rawData = c49164JRg.LIZ.getRawData();
            o.LJI(rawData);
            HashMap<String, Object> hashMap = rawData.toHashMap();
            o.LJIIIIZZ(hashMap, "cardData.rawData!!.toHashMap()");
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                c1hq.put(entry.getKey(), entry.getValue());
            }
        }
        c1hq.put("index", Integer.valueOf(i2));
        ReadableMap readableMap = c49164JRg.LJFF;
        if (readableMap != null) {
            HashMap<String, Object> data = readableMap.toHashMap();
            Integer valueOf = Integer.valueOf(i2);
            o.LJIIIIZZ(data, "data");
            data.put("rank_index", valueOf);
            c1hq.put("log_extra", data);
        } else {
            C1HQ c1hq2 = new C1HQ();
            c1hq2.put("rank_index", Integer.valueOf(i2));
            c1hq.put("log_extra", c1hq2);
        }
        Integer num = c49164JRg.LJ;
        if (num != null) {
            c1hq.put("total", num);
        }
        LynxSearchHorizontalCardData lynxSearchHorizontalCardData3 = c49164JRg.LIZ;
        if (lynxSearchHorizontalCardData3 != null) {
            str = lynxSearchHorizontalCardData3.getSchema();
        } else {
            str = null;
        }
        dynamicPatch.schema = str;
        dynamicPatch.setRawData(C75792yF.LIZJ(c1hq));
        dynamicPatch.setAwemeList(c49164JRg.LIZJ);
        dynamicPatch.setAwemeListRaw(c49164JRg.LIZLLL);
        LynxSearchHorizontalCardData lynxSearchHorizontalCardData4 = c49164JRg.LIZ;
        if (lynxSearchHorizontalCardData4 != null && (height = lynxSearchHorizontalCardData4.getHeight()) != null) {
            i3 = height.intValue();
        } else {
            i3 = 0;
        }
        dynamicPatch.setHeight(i3);
        ILynxSearchHorizontal.HorizontalStyle horizontalStyle = c49164JRg.LJI;
        if (horizontalStyle == null) {
            dynamicPatch.setWidth(-2);
        } else {
            dynamicPatch.setWidth((int) horizontalStyle.getPreferItemWidth());
        }
        List<? extends Aweme> list2 = this.LJLLILLLL;
        if (list2 == null || (aweme = (Aweme) ListProtector.get(list2, i2)) == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            long currentTimeMillis = System.currentTimeMillis();
            JHV jhv = new JHV(str2);
            jhv.LIZ = currentTimeMillis;
            jhv.LIZIZ = i2;
            ((HashMap) JHP.LIZ).put(str2, jhv);
            ((HashMap) this.LJLLI).put(Integer.valueOf(viewHolder.hashCode()), str2);
        }
        JSH jsh2 = (JSH) viewHolder;
        if (i == 0 && (P = jsh2.P()) != null && (list = P.LJLILLLLZI) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (obj instanceof C50098JlO) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            JSR jsr = (JSR) obj;
            if (jsr != null) {
                ((C50098JlO) jsr).LJLLJ = new C49161JRd(this);
            }
        }
        ViewParent viewParent = this.LJLIL;
        while (true) {
            if (viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
            o.LJI(viewParent);
            if (viewParent instanceof C50107JlX) {
                View view = (View) viewParent;
                if (view.getTag() != null && (view.getTag() instanceof JQA)) {
                    Object tag = view.getTag();
                    o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.mob.ItemMobParam");
                    JQA jqa = (JQA) tag;
                    if (jqa != null) {
                        jsh2.LLLLIIIILLL(jqa);
                    }
                }
            }
        }
        jsh2.itemView.post(new ARunnableS3S0001000_8(i, 2));
        HashMap hashMap2 = new HashMap();
        try {
            List<java.util.Map<?, ?>> awemeListRawByPosition = dynamicPatch.getAwemeListRawByPosition(i2);
            o.LJIIIIZZ(awemeListRawByPosition, "dynamicPatch.getAwemeListRawByPosition(position)");
            hashMap2.put("aweme_list", awemeListRawByPosition);
        } catch (Exception e) {
            String th = e.toString();
            C15280iq.LJII("HorizontalAdapter", th);
            C36922EeM.LIZLLL(4, "HorizontalAdapter", th);
        }
        JSP P2 = jsh2.P();
        if (P2 != null) {
            P2.LJLIL.LJIIIZ = true;
        }
        JSH.M(jsh2, dynamicPatch, hashMap2, null, 28);
        JVW.LIZJ(i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        JSH LIZ = JSI.LIZ(parent, new C49308JWu());
        AqS174S0100000_8 aqS174S0100000_8 = this.LJLLL;
        if (aqS174S0100000_8 != null) {
            aqS174S0100000_8.invoke(LIZ);
        }
        C0AX.LIZ(parent, LIZ.itemView, R.id.lj7);
        View view = LIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LIZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(JSH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LIZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LIZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = JSH.class.getName();
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49160JRc(Context context, JJK listener, JIB mContainerStatusProvider, C49153JQv mScrollStateManager, RecyclerView mRecyclerView, JRE jre) {
        super(mRecyclerView);
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(mContainerStatusProvider, "mContainerStatusProvider");
        o.LJIIIZ(mScrollStateManager, "mScrollStateManager");
        o.LJIIIZ(mRecyclerView, "mRecyclerView");
        this.LJLJJI = context;
        this.LJLJJL = jre;
        this.LJLJLJ = -1;
        this.LJLJLLL = new HashMap();
        this.LJLL = new ArrayList();
        this.LJLLI = new HashMap();
        mRecyclerView.addOnAttachStateChangeListener(new JI1(mScrollStateManager, mContainerStatusProvider, this, mRecyclerView));
    }
}
