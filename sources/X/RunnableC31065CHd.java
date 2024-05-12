package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveRecyclerViewImageOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRvPoolFluencySupportSampleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import defpackage.a1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CHd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class RunnableC31065CHd extends RecyclerView implements Runnable {
    public static final /* synthetic */ int LLLIIII = 0;
    public volatile boolean LLLF;
    public long LLLFF;
    public int LLLFFI;
    public EnumC31066CHe LLLFZ;
    public CHK LLLI;
    public int LLLII;

    public final void LJLJJL() {
        this.LLLF = true;
        if (this.LLLFZ == EnumC31066CHe.DEFAULT) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_rv_add_view_time");
        LIZ.LJIJJ(this.LLLFZ.getValue(), "label");
        LIZ.LJIJJ(Integer.valueOf(this.LLLFFI), "position");
        LIZ.LJIJJ(Long.valueOf((SystemClock.uptimeMillis() - this.LLLFF) - 300), "use_time");
        LIZ.LJJIIJZLJL();
        CHK chk = this.LLLI;
        if (chk != null) {
            chk.stop();
        } else {
            o.LJIJI("fpsTracerAdapter");
            throw null;
        }
    }

    public final void LJLJJLL() {
        int i;
        if (LiveRecyclerViewImageOptSetting.INSTANCE.enabled() && (i = this.LLLII) != 0) {
            LJIIJJI(new CM7(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this);
        super.onDetachedFromWindow();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJLJJL();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null) {
            view.removeCallbacks(this);
            if (!this.LLLF) {
                this.LLLFFI = RecyclerView.LJJJJIZL(view);
                view.postDelayed(this, 300L);
            }
        }
    }

    public final void setPauseLoadImageWhenScrollWithoutExperiment(int i) {
        if (i >= 0) {
            LJIIJJI(new CM7(i));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RunnableC31065CHd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool LJLJLJ(RunnableC31065CHd runnableC31065CHd, EnumC31066CHe enumC31066CHe) {
        return runnableC31065CHd.LJLJL(enumC31066CHe, true);
    }

    public final RecyclerView.RecycledViewPool LJLJL(EnumC31066CHe poolLabel, boolean z) {
        int i;
        Object obj;
        boolean z2;
        Object obj2;
        String label;
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(poolLabel, "poolLabel");
        RecyclerView.RecycledViewPool recycledViewPool = null;
        if (poolLabel != EnumC31066CHe.DEFAULT && poolLabel != this.LLLFZ) {
            this.LLLFZ = poolLabel;
            this.LLLII = LiveRecyclerViewImageOptSetting.INSTANCE.dyForRvLabel(poolLabel.getValue());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rv_slide_");
            LIZ.append(this.LLLFZ.getValue());
            String LIZIZ = X1D.LIZIZ(LIZ);
            LiveRvPoolFluencySupportSampleSetting liveRvPoolFluencySupportSampleSetting = LiveRvPoolFluencySupportSampleSetting.INSTANCE;
            int i2 = 10;
            if (liveRvPoolFluencySupportSampleSetting.getValue()) {
                i = 10;
            } else {
                i = 1;
            }
            CHK chk = new CHK(LIZIZ, i, null, 12);
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            java.util.Map map = (java.util.Map) dataChannelGlobal.mv0(C29824BnA.class);
            boolean z3 = false;
            if (map == null || (obj = (String) map.get("anchor_id")) == null) {
                obj = 0;
            }
            if (!(obj instanceof Long) || currentUserId != ((Number) obj).longValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            chk.LJII = z2;
            LJIIJJI(new CHM(chk));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("rv_");
            LIZ2.append(this.LLLFZ.getValue());
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (!liveRvPoolFluencySupportSampleSetting.getValue()) {
                i2 = 1;
            }
            CHK chk2 = new CHK(LIZIZ2, i2, null, 12);
            long currentUserId2 = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            java.util.Map map2 = (java.util.Map) dataChannelGlobal.mv0(C29824BnA.class);
            if (map2 == null || (obj2 = (String) map2.get("anchor_id")) == null) {
                obj2 = 0;
            }
            if ((obj2 instanceof Long) && currentUserId2 == ((Number) obj2).longValue()) {
                z3 = true;
            }
            chk2.LJII = z3;
            this.LLLI = chk2;
            if (!chk2.LJIIIIZZ) {
                chk2.start();
            }
            this.LLLFF = SystemClock.uptimeMillis();
            if (!LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE.enableReusePool()) {
                return null;
            }
            C0A2 layoutManager = getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.LLFZ = true;
            }
            if (z) {
                label = this.LLLFZ.getValue();
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(this.LLLFZ.getValue());
                LIZ3.append("_L");
                label = X1D.LIZIZ(LIZ3);
            }
            o.LJIIIZ(label, "label");
            ConcurrentHashMap<String, RecyclerView.RecycledViewPool> concurrentHashMap = BMS.LIZ;
            recycledViewPool = concurrentHashMap.get(label);
            if (recycledViewPool == null) {
                recycledViewPool = new RecyclerView.RecycledViewPool();
                concurrentHashMap.put(label, recycledViewPool);
            }
            setRecycledViewPool(recycledViewPool);
        }
        return recycledViewPool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC31065CHd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LLLFZ = EnumC31066CHe.DEFAULT;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
