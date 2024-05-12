package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Jf8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49710Jf8 extends C49811Jgl implements InterfaceC49780JgG {
    public boolean LLLI;
    public boolean LLLII;
    public final Lock LLLIIII;
    public boolean LLLIIIIL;
    public JIB LLLIIIL;
    public final C49718JfG<InterfaceC49620Jdg> LLLIIL;

    public final void LJLJJLL() {
        this.LLLI = true;
        invalidate();
        C49718JfG<InterfaceC49620Jdg> c49718JfG = this.LLLIIL;
        if (!c49718JfG.LIZLLL) {
            c49718JfG.LIZLLL = true;
            c49718JfG.LIZIZ = null;
            C49734JfW<InterfaceC49620Jdg> c49734JfW = c49718JfG.LIZJ;
            ArrayList arrayList = c49718JfG.LIZ;
            c49734JfW.LIZ = arrayList;
            c49734JfW.LIZIZ = arrayList.size();
            C49734JfW<InterfaceC49620Jdg> c49734JfW2 = c49718JfG.LIZJ;
            try {
                int i = c49734JfW2.LIZIZ;
                for (int i2 = 0; i2 < i; i2++) {
                    ((InterfaceC49620Jdg) ListProtector.get(c49734JfW2.LIZ, i2)).LIZ();
                }
                return;
            } finally {
                this.LLLIIL.LIZ();
            }
        }
        throw new IllegalStateException("Iteration already started");
    }

    @Override // X.InterfaceC49780JgG
    public JIB getContainerProvider() {
        return this.LLLIIIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLLIIIIL) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLLI) {
            super.draw(canvas);
            return;
        }
        try {
            if (!((ReentrantLock) this.LLLIIII).tryLock(1000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            ((ReentrantLock) this.LLLIIII).unlock();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setContainerProvider(JIB jib) {
        this.LLLIIIL = jib;
    }

    public C49710Jf8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLI = true;
        this.LLLIIII = new ReentrantLock();
        this.LLLIIIIL = true;
        this.LLLIIIL = null;
        this.LLLIIL = new C49718JfG<>();
    }
}
