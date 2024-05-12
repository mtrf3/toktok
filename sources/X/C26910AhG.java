package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AhG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26910AhG extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26910AhG LJLIL = new C26910AhG();

    public C26910AhG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup parent = viewGroup;
        o.LJIIIZ(parent, "parent");
        return new RelationStatusViewHolder(parent);
    }
}
