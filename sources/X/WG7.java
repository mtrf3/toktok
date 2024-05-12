package X;

import Y.IDrS52S0100000_14;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WG7 extends RecyclerView {
    public WG9 LLLF;
    public C41254GHa LLLFF;
    public float LLLFFI;
    public WG8 LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;

    public int getMaxCntOnScreen() {
        WG9 wg9 = this.LLLF;
        if (wg9 != null) {
            return wg9.getMaxCntOnScreen();
        }
        o.LJIJI("cutMusicView");
        throw null;
    }

    public final float getScrollDx() {
        return this.LLLFFI;
    }

    public final void LJLJJL(MusicWaveBean musicWaveBean) {
        if (musicWaveBean != null) {
            WG9 wg9 = this.LLLF;
            if (wg9 != null) {
                wg9.setAudioWaveViewData(musicWaveBean);
                C41254GHa c41254GHa = this.LLLFF;
                if (c41254GHa != null) {
                    setAdapter(c41254GHa);
                    return;
                } else {
                    o.LJIJI("adatper");
                    throw null;
                }
            }
            o.LJIJI("cutMusicView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (e.getAction() == 1) {
            this.LLLI = true;
        } else if (e.getAction() == 0) {
            this.LLLII = true;
        }
        return super.onTouchEvent(e);
    }

    public void setHaptic(boolean z) {
        this.LLLIIII = z;
    }

    public void setOnScrollingListener(WG8 wg8) {
        this.LLLFZ = wg8;
    }

    public void setParam(WGC param) {
        o.LJIIIZ(param, "param");
        WG9 wg9 = this.LLLF;
        if (wg9 != null) {
            wg9.setParam(param);
        } else {
            o.LJIJI("cutMusicView");
            throw null;
        }
    }

    public final void setScrollDx(float f) {
        this.LLLFFI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WG7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f;
        a1.LJFF(context, "context");
        setClipToPadding(false);
        this.LLLF = new WG9(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        linearLayoutManager.LLJJIJI(C90193gN.LIZIZ(context));
        if (C90193gN.LIZIZ(context)) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        setScaleX(f);
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.LLLFF = new C41254GHa(this);
        LJIIJJI(new IDrS52S0100000_14(this, 5));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
