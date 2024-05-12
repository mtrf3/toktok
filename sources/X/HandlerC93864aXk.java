package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aXk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class HandlerC93864aXk extends Handler {
    public static final /* synthetic */ int LIZIZ = 0;
    public final WeakReference<C94855anj> LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC93864aXk(C94855anj layerAdapter) {
        super(C16880lQ.LLJJJJ());
        o.LJIIIZ(layerAdapter, "layerAdapter");
        this.LIZ = new WeakReference<>(layerAdapter);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        RecyclerView recyclerView;
        RecyclerView.ViewHolder LJJIZ;
        List<AbstractC94471ahX<InterfaceC94376ag0>> LLFFF;
        int i;
        View view;
        o.LJIIIZ(msg, "msg");
        C94855anj c94855anj = this.LIZ.get();
        if (c94855anj != null) {
            Object obj = msg.obj;
            if (obj != null) {
                int intValue = ((Integer) obj).intValue();
                WeakReference<RecyclerView> LJZL = c94855anj.LJZL();
                if (LJZL != null && (recyclerView = LJZL.get()) != null && (LJJIZ = recyclerView.LJJIZ(intValue)) != null) {
                    if (!(LJJIZ instanceof C94389agD)) {
                        LJJIZ = null;
                    }
                    C94389agD c94389agD = (C94389agD) LJJIZ;
                    AbstractC94471ahX<InterfaceC94376ag0> abstractC94471ahX = (AbstractC94471ahX) ListProtector.get(c94855anj.LJLIL, intValue);
                    int i2 = msg.what;
                    if (i2 == 1) {
                        if (c94389agD != null && (view = c94389agD.itemView) != null) {
                            view.performHapticFeedback(0);
                            return;
                        }
                        return;
                    }
                    if (i2 == 0) {
                        if (c94389agD == null) {
                            return;
                        }
                        c94855anj.onEventLayerAction("long_press");
                        c94855anj.LLIIIJ(true);
                        c94855anj.LLIFFJFJJ(intValue, true);
                        if (c94389agD.getItemViewType() == 0) {
                            C94855anj.LLIIIILZ(c94855anj, true, abstractC94471ahX, c94389agD.itemView.findViewById(R.id.nnh), c94855anj.LLII(c94389agD, abstractC94471ahX), 16);
                        } else {
                            C94855anj.LLIIIILZ(c94855anj, true, abstractC94471ahX, c94389agD.itemView.findViewById(R.id.nns), c94855anj.LLII(c94389agD, abstractC94471ahX), 16);
                        }
                        InterfaceC93865aXl interfaceC93865aXl = c94855anj.LJLJLJ;
                        if (interfaceC93865aXl == null) {
                            return;
                        }
                        interfaceC93865aXl.s3();
                        return;
                    }
                    if (i2 != 2) {
                        return;
                    }
                    C94855anj.LLIIIILZ(c94855anj, false, null, null, false, 24);
                    if (abstractC94471ahX.LIZLLL()) {
                        InterfaceC93998aZu interfaceC93998aZu = (InterfaceC93998aZu) ListProtector.get(c94855anj.LJLIL, intValue);
                        if (interfaceC93998aZu != null && (LLFFF = c94855anj.LLFFF(intValue)) != null && interfaceC93998aZu.LJJJLZIJ()) {
                            for (Object obj2 : ORZ.LLIILII(LLFFF)) {
                                if (obj2 != null && (!c94855anj.LJLIL.isEmpty())) {
                                    i = c94855anj.LJLIL.indexOf(obj2);
                                } else {
                                    i = -1;
                                }
                                ListProtector.remove(c94855anj.LJLIL, i);
                            }
                            interfaceC93998aZu.LIZJ(false);
                            c94855anj.notifyDataSetChanged();
                        }
                        if (abstractC94471ahX.LIZIZ() != null) {
                            c94855anj.LLFII(true, (C94669akj) abstractC94471ahX);
                        }
                        c94855anj.LJLLL = abstractC94471ahX;
                        return;
                    }
                    if (c94389agD == null) {
                        return;
                    }
                    c94855anj.LLFZ(true, c94389agD);
                    C94007aa3 c94007aa3 = c94855anj.LJLILLLLZI;
                    if (c94007aa3 == null) {
                        return;
                    }
                    C1C8 c1c8 = c94007aa3.LIZ;
                    if (c1c8 != null) {
                        c1c8.LJIJI(c94389agD);
                        return;
                    } else {
                        o.LJIJI("itemTouchHelper");
                        throw null;
                    }
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }
}
