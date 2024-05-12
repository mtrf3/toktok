package X;

import Y.IDrS12S0200000_7;
import Y.IDrS46S0100000_7;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS157S0100000_7;

/* renamed from: X.Hwx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45719Hwx extends RecyclerView {
    public C45737HxF LLLF;
    public final C62822Ol8 LLLFF;
    public Boolean LLLFFI;
    public InterfaceC45740HxI LLLFZ;

    private final int getScreenHeight() {
        return ((Number) this.LLLFF.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RecyclerView recyclerView;
        C45737HxF c45737HxF = this.LLLF;
        if (c45737HxF != null && (recyclerView = c45737HxF.LJLJI) != null) {
            recyclerView.LJJLL(c45737HxF.LJZ);
            c45737HxF.LJLJI = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C45737HxF c45737HxF = this.LLLF;
        if (c45737HxF != null) {
            c45737HxF.LIZ(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC029409q<?> abstractC029409q) {
        C45737HxF c45737HxF;
        super.setAdapter(abstractC029409q);
        if ((abstractC029409q instanceof InterfaceC45721Hwz) && (c45737HxF = this.LLLF) != null) {
            c45737HxF.setSectionIndexer((InterfaceC45721Hwz) abstractC029409q);
        }
    }

    public final void setFastScrollEnabled(boolean z) {
        C45737HxF c45737HxF = this.LLLF;
        if (c45737HxF != null) {
            c45737HxF.setEnabled(z);
        }
        this.LLLFFI = Boolean.valueOf(z);
    }

    public final void setFastScrollListener(InterfaceC45740HxI interfaceC45740HxI) {
        C45737HxF c45737HxF = this.LLLF;
        if (c45737HxF != null) {
            c45737HxF.setFastScrollListener(interfaceC45740HxI);
        }
        this.LLLFZ = interfaceC45740HxI;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C45737HxF c45737HxF = this.LLLF;
        if (c45737HxF == null) {
            return;
        }
        c45737HxF.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45719Hwx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 488));
        LJIIJJI(new IDrS12S0200000_7(this, context, attributeSet, 0));
        LJIIJJI(new IDrS46S0100000_7(this, 2));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    public static final void LJLJJL(C45719Hwx c45719Hwx, Context context) {
        C45737HxF c45737HxF;
        C45737HxF c45737HxF2;
        c45719Hwx.getClass();
        C45737HxF c45737HxF3 = new C45737HxF(context);
        c45719Hwx.LLLF = c45737HxF3;
        c45737HxF3.setId(R.id.d4z);
        C45737HxF c45737HxF4 = c45719Hwx.LLLF;
        if (c45737HxF4 != null) {
            c45737HxF4.setEnabled(false);
        }
        C45737HxF c45737HxF5 = c45719Hwx.LLLF;
        if (c45737HxF5 != null) {
            c45737HxF5.LIZ(c45719Hwx);
        }
        if ((c45719Hwx.getAdapter() instanceof InterfaceC45721Hwz) && (c45737HxF2 = c45719Hwx.LLLF) != null) {
            c45737HxF2.setSectionIndexer((InterfaceC45721Hwz) c45719Hwx.getAdapter());
        }
        Boolean bool = c45719Hwx.LLLFFI;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            C45737HxF c45737HxF6 = c45719Hwx.LLLF;
            if (c45737HxF6 != null) {
                c45737HxF6.setEnabled(booleanValue);
            }
        }
        InterfaceC45740HxI interfaceC45740HxI = c45719Hwx.LLLFZ;
        if (interfaceC45740HxI != null && (c45737HxF = c45719Hwx.LLLF) != null) {
            c45737HxF.setFastScrollListener(interfaceC45740HxI);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean LJJJI(int i, int i2) {
        InterfaceC45718Hww interfaceC45718Hww;
        if (Math.abs(i2) > getScreenHeight() * 5) {
            if (InterfaceC44948HkW.LJI.getOpenAlbumOptiGroup() == 2) {
                Object adapter = getAdapter();
                if ((adapter instanceof InterfaceC45718Hww) && (interfaceC45718Hww = (InterfaceC45718Hww) adapter) != null) {
                    interfaceC45718Hww.LJJLI();
                }
            }
            C42315Gj9.LIZIZ("tool_album_scroll_high_speed", LiveMaxRetainAlogMessageSizeSetting.DEFAULT, -1L);
        }
        if (V0Q.Default.nextFloat() < 0.1d) {
            C42315Gj9.LIZIZ("tool_album_scroll", LiveMaxRetainAlogMessageSizeSetting.DEFAULT, -1L);
        }
        return super.LJJJI(i, i2);
    }
}
