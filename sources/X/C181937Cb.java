package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181937Cb extends AbstractC13940gg {
    public WeakReference<Comment> LJ;
    public WeakReference<InterfaceC100393wp> LJFF;
    public WeakReference<C53691L5j> LJI;
    public InterfaceC65784Pro<String> LJII = new AqS153S0100000_3(this, 1691);
    public final C181947Cc LJIIIIZZ = new InterfaceC19530ph() { // from class: X.7Cc
        @Override // X.InterfaceC19530ph
        public final void LIZ(View view, String itemID) {
            C53691L5j c53691L5j;
            EnumC53695L5n mode;
            WeakReference<InterfaceC100393wp> weakReference;
            InterfaceC100393wp interfaceC100393wp;
            o.LJIIIZ(itemID, "itemID");
            WeakReference<C53691L5j> weakReference2 = C181937Cb.this.LJI;
            if (weakReference2 != null && (c53691L5j = weakReference2.get()) != null && (mode = c53691L5j.getMode()) != null && EnumC53695L5n.NONE != mode && (weakReference = C181937Cb.this.LJFF) != null && (interfaceC100393wp = weakReference.get()) != null) {
                interfaceC100393wp.LJFF(mode);
            }
        }
    };

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC19530ph LJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJII = interfaceC65784Pro;
    }

    public final void LJIIL(Comment comment, InterfaceC100393wp interfaceC100393wp) {
        if (comment != null) {
            this.LJ = new WeakReference<>(comment);
        }
        if (interfaceC100393wp != null) {
            this.LJFF = new WeakReference<>(interfaceC100393wp);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7Cc] */
    public C181937Cb(WeakReference<Comment> weakReference, WeakReference<InterfaceC100393wp> weakReference2, WeakReference<C53691L5j> weakReference3) {
        this.LJ = weakReference;
        this.LJFF = weakReference2;
        this.LJI = weakReference3;
    }
}
