package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.ui.framework.DialogLeaf;
import defpackage.a1;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CqW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32580CqW extends ConstraintLayout {
    public Fragment LJLIL;
    public final ConcurrentHashMap<Integer, AbstractC32579CqV> LJLILLLLZI;

    public final LifecycleCoroutineScope getLifecycleScope() {
        Fragment fragment = this.LJLIL;
        if (!(fragment instanceof LifecycleOwner) || fragment == null) {
            return null;
        }
        return LifecycleOwnerKt.getLifecycleScope(fragment);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<Map.Entry<Integer, AbstractC32579CqV>> it = this.LJLILLLLZI.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().LJIILJJIL();
        }
    }

    public final Fragment getFragment() {
        return this.LJLIL;
    }

    public final boolean LJJLL(int i) {
        AbstractC32579CqV abstractC32579CqV = this.LJLILLLLZI.get(Integer.valueOf(i));
        if ((abstractC32579CqV instanceof DialogLeaf) && ((DialogLeaf) abstractC32579CqV).LJLL) {
            LJJZ(i);
            return false;
        }
        return this.LJLILLLLZI.containsKey(Integer.valueOf(i));
    }

    public final void LJJZ(int i) {
        AbstractC32579CqV remove;
        if (getContext() != null && (remove = this.LJLILLLLZI.remove(Integer.valueOf(i))) != null) {
            remove.LJIJJ();
        }
    }

    public final void setFragment(Fragment fragment) {
        this.LJLIL = fragment;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32580CqW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJJLJLI(AbstractC32579CqV leaf, ViewGroup viewGroup) {
        Context context;
        o.LJIIIZ(leaf, "leaf");
        if (!this.LJLILLLLZI.containsKey(Integer.valueOf(leaf.LJIIL())) && (context = getContext()) != null) {
            leaf.LJLJJL = this;
            LifecycleCoroutineScope lifecycleScope = getLifecycleScope();
            if (lifecycleScope != null) {
                XKX.LIZLLL(lifecycleScope, null, null, new C32581CqX(leaf, context, this, viewGroup, null), 3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32580CqW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new ConcurrentHashMap<>();
    }
}
