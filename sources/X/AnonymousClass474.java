package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;

/* renamed from: X.474, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass474 {
    public final TuxIconView LIZ;
    public C109544Rq LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1027));
    public final C62822Ol8 LIZLLL;

    public final void LIZ() {
        ReadStateViewModel readStateViewModel;
        java.util.Set<String> set;
        String str;
        C109544Rq c109544Rq = this.LIZIZ;
        if (c109544Rq != null) {
            int msgStatus = c109544Rq.getMsgStatus();
            if (msgStatus == 3) {
                if (C30581Hy.LJJII(c109544Rq)) {
                    msgStatus = 2;
                }
                this.LIZ.setTuxIcon((C2068389v) this.LIZLLL.getValue());
                this.LIZ.setVisibility(0);
                readStateViewModel = (ReadStateViewModel) this.LIZJ.getValue();
                if (readStateViewModel != null || (set = readStateViewModel.LJLJJLL) == null) {
                    return;
                }
                C109544Rq c109544Rq2 = this.LIZIZ;
                String str2 = null;
                if (c109544Rq2 != null) {
                    str2 = c109544Rq2.getUuid();
                }
                if (!(!ORZ.LJLJJI(str2, set))) {
                    return;
                }
                C101573yj.LJI(C101573yj.LIZ, this.LIZIZ, false);
                C109544Rq c109544Rq3 = this.LIZIZ;
                if (c109544Rq3 == null || (str = c109544Rq3.getUuid()) == null) {
                    str = "";
                }
                set.add(str);
                return;
            }
            if (msgStatus != 0 && msgStatus != 1) {
                if (msgStatus != 2) {
                    if (msgStatus != 3) {
                        if (msgStatus != 5) {
                            return;
                        }
                    }
                    this.LIZ.setTuxIcon((C2068389v) this.LIZLLL.getValue());
                    this.LIZ.setVisibility(0);
                    readStateViewModel = (ReadStateViewModel) this.LIZJ.getValue();
                    if (readStateViewModel != null) {
                        return;
                    } else {
                        return;
                    }
                }
                this.LIZ.setVisibility(8);
                return;
            }
            this.LIZ.setVisibility(8);
        }
    }

    public AnonymousClass474(TuxIconView tuxIconView) {
        this.LIZ = tuxIconView;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1026));
        this.LIZLLL = C221108m2.LIZIZ(AnonymousClass475.LJLIL);
        tuxIconView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) LIZIZ.getValue());
        tuxIconView.addOnAttachStateChangeListener((View.OnAttachStateChangeListener) LIZIZ.getValue());
    }
}
