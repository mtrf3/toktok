package X;

import Y.IDrS52S0100000_14;
import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.WFx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81993WFx extends RecyclerView {
    public C81991WFv LLLF;
    public C41256GHc LLLFF;
    public float LLLFFI;
    public InterfaceC81994WFy LLLFZ;
    public boolean LLLI;
    public boolean LLLII;

    public final float getScrollDx() {
        return this.LLLFFI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81993WFx(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        setClipToPadding(false);
        this.LLLF = new C81991WFv(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        linearLayoutManager.LLJJIJI(C173636rf.LIZIZ(context));
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.LLLFF = new C41256GHc(this);
        LJIIJJI(new IDrS52S0100000_14(this, 7));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (i == 1) {
            setRotationY(180.0f);
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

    public final void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null) {
            C81991WFv c81991WFv = this.LLLF;
            if (c81991WFv != null) {
                c81991WFv.setAudioWaveViewData(aVMusicWaveBean);
                C41256GHc c41256GHc = this.LLLFF;
                if (c41256GHc != null) {
                    setAdapter(c41256GHc);
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

    public final void setProgressMaxWidth(int i) {
        C81991WFv c81991WFv = this.LLLF;
        if (c81991WFv != null) {
            c81991WFv.setProgressMaxWidth(i);
        } else {
            o.LJIJI("cutMusicView");
            throw null;
        }
    }

    public final void setScrollDx(float f) {
        this.LLLFFI = f;
    }

    public final void setScrollListener(InterfaceC81994WFy listener) {
        o.LJIIIZ(listener, "listener");
        this.LLLFZ = listener;
    }

    public final void setWaveColor(int i) {
        C81991WFv c81991WFv = this.LLLF;
        if (c81991WFv != null) {
            c81991WFv.setColor(i);
        } else {
            o.LJIJI("cutMusicView");
            throw null;
        }
    }
}
