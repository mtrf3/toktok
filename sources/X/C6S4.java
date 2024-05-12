package X;

import Y.IDObjectS175S0100000_2;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6S4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6S4 extends FrameLayout {
    public C1NS<QAStickerModel> LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public T5T LJLJI;
    public OPX LJLJJI;

    public final T5T getContentEditText() {
        T5T t5t = this.LJLJI;
        if (t5t != null) {
            return t5t;
        }
        o.LJIJI("contentEditText");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6S4(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
    }

    public final void setContentEditText(T5T t5t) {
        o.LJIIIZ(t5t, "<set-?>");
        this.LJLJI = t5t;
    }

    public final void LIZ(C1NS<QAStickerModel> container, LifecycleOwner owner) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(owner, "owner");
        this.LJLIL = container;
        this.LJLILLLLZI = owner;
        C16880lQ.LLLZIIL(R.layout.c9i, C16880lQ.LLZIL(getContext()), this);
        View findViewById = findViewById(R.id.ih7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.qa_sticker_content_edit_text)");
        setContentEditText((T5T) findViewById);
        getContentEditText().addTextChangedListener(new IDObjectS175S0100000_2(this, 14));
        View findViewById2 = findViewById(R.id.ih6);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.qa_sticker_avatar)");
        this.LJLJJI = (OPX) findViewById2;
        C1NS<QAStickerModel> c1ns = this.LJLIL;
        if (c1ns != null) {
            LiveState<V> LIZ = c1ns.LIZ(new TBT() { // from class: X.6S2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((QAStickerModel) obj).getVisible());
                }
            });
            LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
            if (lifecycleOwner == null) {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
            LIZ.LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 546));
            C1NS<QAStickerModel> c1ns2 = this.LJLIL;
            if (c1ns2 != null) {
                LiveState<V> LIZ2 = c1ns2.LIZ(new TBT() { // from class: X.6S3
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((QAStickerModel) obj).getEditable());
                    }
                });
                LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
                if (lifecycleOwner2 == null) {
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
                LIZ2.LJIIIIZZ(lifecycleOwner2, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 550));
                C1NS<QAStickerModel> c1ns3 = this.LJLIL;
                if (c1ns3 != null) {
                    LiveState<V> LIZ3 = c1ns3.LIZ(new TBT() { // from class: X.6S9
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((QAStickerModel) obj).getQuestionContent();
                        }
                    });
                    LifecycleOwner lifecycleOwner3 = this.LJLILLLLZI;
                    if (lifecycleOwner3 == null) {
                        o.LJIJI("lifecycleOwner");
                        throw null;
                    }
                    LIZ3.LJIIIIZZ(lifecycleOwner3, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 553));
                    C1NS<QAStickerModel> c1ns4 = this.LJLIL;
                    if (c1ns4 != null) {
                        LiveState<V> LIZ4 = c1ns4.LIZ(new TBT() { // from class: X.6S7
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((QAStickerModel) obj).getClickable());
                            }
                        });
                        LifecycleOwner lifecycleOwner4 = this.LJLILLLLZI;
                        if (lifecycleOwner4 == null) {
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                        LIZ4.LJIIIIZZ(lifecycleOwner4, Lifecycle.State.STARTED, new C6S6(this));
                        C1NS<QAStickerModel> c1ns5 = this.LJLIL;
                        if (c1ns5 != null) {
                            LiveState<V> LIZ5 = c1ns5.LIZ(new TBT() { // from class: X.6S8
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((QAStickerModel) obj).getAvatarUrl();
                                }
                            });
                            LifecycleOwner lifecycleOwner5 = this.LJLILLLLZI;
                            if (lifecycleOwner5 == null) {
                                o.LJIJI("lifecycleOwner");
                                throw null;
                            }
                            LIZ5.LJIIIIZZ(lifecycleOwner5, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 543));
                            C1NS<QAStickerModel> c1ns6 = this.LJLIL;
                            if (c1ns6 != null) {
                                LiveState<V> LIZ6 = c1ns6.LIZ(new TBT() { // from class: X.6S1
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return Float.valueOf(((QAStickerModel) obj).getAlpha());
                                    }
                                });
                                LifecycleOwner lifecycleOwner6 = this.LJLILLLLZI;
                                if (lifecycleOwner6 == null) {
                                    o.LJIJI("lifecycleOwner");
                                    throw null;
                                }
                                LIZ6.LJIIIIZZ(lifecycleOwner6, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 545));
                                return;
                            }
                            o.LJIJI("stateContainer");
                            throw null;
                        }
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                    o.LJIJI("stateContainer");
                    throw null;
                }
                o.LJIJI("stateContainer");
                throw null;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }
}
