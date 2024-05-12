package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114014dh extends FrameLayout implements InterfaceC113814dN {
    public List<? extends InterfaceC62225ObV> LJLIL;
    public InterfaceC113814dN LJLILLLLZI;
    public final C113854dR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C114014dh(Context ctx, AttributeSet attributeSet) {
        super(ctx, attributeSet);
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(attributeSet, "attributeSet");
        this.LJLIL = C61878OQg.INSTANCE;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.afm});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ble.MicroShareChannelBar)");
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bmi, this, true);
        View findViewById = findViewById(R.id.b9k);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.channel_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        C113854dR c113854dR = new C113854dR(ctx, this, C114024di.LIZ, z, 0, 0, null, 112);
        this.LJLJI = c113854dR;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        c113854dR.setData(this.LJLIL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c113854dR);
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        InterfaceC113814dN interfaceC113814dN = this.LJLILLLLZI;
        if (interfaceC113814dN != null) {
            interfaceC113814dN.LJIIIZ(channel, view);
        }
    }
}
