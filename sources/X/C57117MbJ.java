package X;

import Y.IDcS38S0100000_9;
import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.friendstab.ui.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.MbJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57117MbJ extends SYL {
    public EnumC54550Lb0 LLLFF;

    public final void setMode(EnumC54550Lb0 mode) {
        o.LJIIIZ(mode, "mode");
        this.LLLFF = mode;
        if (mode == EnumC54550Lb0.LAST_ITEM) {
            setNestedScrollingEnabled(false);
        }
        AbstractC029409q adapter = getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new C57118MbK(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.recyclerview.widget.GridLayoutManager, com.ss.android.ugc.aweme.views.WrapGridLayoutManager] */
    public C57117MbJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FixedLinearlayoutManager fixedLinearlayoutManager;
        a1.LJFF(context, "context");
        this.LLLFF = EnumC54550Lb0.EMPTY_STATE;
        if (C52342KgU.LIZIZ()) {
            setPadding(C7MY.LIZIZ(6), C7MY.LIZIZ(6), C7MY.LIZIZ(6), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
            ?? wrapGridLayoutManager = new WrapGridLayoutManager(2);
            wrapGridLayoutManager.LLIILII = new IDcS38S0100000_9(this, 4);
            fixedLinearlayoutManager = wrapGridLayoutManager;
        } else {
            fixedLinearlayoutManager = new FixedLinearlayoutManager(context);
        }
        setLayoutManager(fixedLinearlayoutManager);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
