package X;

import android.view.View;
import android.view.ViewStub;
import kotlin.jvm.internal.o;

/* renamed from: X.473, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass473 {
    public static final /* synthetic */ AnonymousClass473 LIZ = new AnonymousClass473();

    public static AnonymousClass479 LIZ(int i, View root) {
        o.LJIIIZ(root, "root");
        if (C1044648c.LIZ()) {
            final ViewStub viewStub = (ViewStub) root.findViewById(i);
            if (viewStub != null) {
                return new AnonymousClass479(viewStub) { // from class: X.47C
                    public final ViewStub LIZIZ;
                    public boolean LIZJ;
                    public View LIZLLL;

                    @Override // X.AnonymousClass479
                    public final boolean LIZIZ() {
                        return this.LIZJ;
                    }

                    {
                        this.LIZIZ = viewStub;
                    }

                    @Override // X.AnonymousClass479
                    public final void LIZ(int i2) {
                        View findViewById;
                        View view = this.LIZLLL;
                        if (view != null && (findViewById = view.findViewById(i2)) != null) {
                            C146035oF.LIZIZ(findViewById);
                        }
                    }

                    @Override // X.AnonymousClass479
                    public final <T extends View> T LIZJ(int i2) {
                        View view;
                        if (!this.LIZJ) {
                            this.LIZJ = true;
                            view = this.LIZIZ.inflate();
                            this.LIZLLL = view;
                        } else {
                            view = this.LIZLLL;
                        }
                        if (view != null) {
                            return (T) view.findViewById(i2);
                        }
                        return null;
                    }
                };
            }
            return new AnonymousClass479() { // from class: X.47G
                @Override // X.AnonymousClass479
                public final void LIZ(int i2) {
                }

                @Override // X.AnonymousClass479
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.AnonymousClass479
                public final <T extends View> T LIZJ(int i2) {
                    return null;
                }
            };
        }
        return new C47D(root);
    }
}
