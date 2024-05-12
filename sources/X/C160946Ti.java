package X;

import Y.ACListenerS22S0100000_2;
import Y.IDObjectS175S0100000_2;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160946Ti extends AbstractC160976Tl<EmbedHashTagStickerModel> {
    public C1NS<EmbedHashTagStickerModel> LJLJJL;
    public LifecycleOwner LJLJJLL;
    public T5T LJLJL;

    @Override // X.AbstractC161116Tz, X.C6UF
    public final void LJFF() {
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 13)));
    }

    public final T5T getContentEditText() {
        T5T t5t = this.LJLJL;
        if (t5t != null) {
            return t5t;
        }
        o.LJIJI("contentEditText");
        throw null;
    }

    public final void LIZLLL() {
        C16880lQ.LLLZIIL(R.layout.azh, C16880lQ.LLZIL(getContext()), this);
        View findViewById = findViewById(R.id.d04);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.ev_lay…shtag_sticker_input_view)");
        setContentEditText((T5T) findViewById);
    }

    public final void setContentEditText(T5T t5t) {
        o.LJIIIZ(t5t, "<set-?>");
        this.LJLJL = t5t;
    }

    public final void LIZ(C1NS<EmbedHashTagStickerModel> container, LifecycleOwner owner) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(owner, "owner");
        this.LJLJJL = container;
        this.LJLJJLL = owner;
        LIZLLL();
        getContentEditText().addTextChangedListener(new IDObjectS175S0100000_2(this, 0));
        C1NS<EmbedHashTagStickerModel> c1ns = this.LJLJJL;
        if (c1ns != null) {
            LiveState<V> LIZ = c1ns.LIZ(new TBT() { // from class: X.6TZ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((EmbedHashTagStickerModel) obj).getVisible());
                }
            });
            LifecycleOwner lifecycleOwner = this.LJLJJLL;
            if (lifecycleOwner == null) {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
            LIZ.LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 11));
            C1NS<EmbedHashTagStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                LiveState<V> LIZ2 = c1ns2.LIZ(new TBT() { // from class: X.6Ta
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((EmbedHashTagStickerModel) obj).getEditable());
                    }
                });
                LifecycleOwner lifecycleOwner2 = this.LJLJJLL;
                if (lifecycleOwner2 == null) {
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
                LIZ2.LJIIIIZZ(lifecycleOwner2, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 12));
                C1NS<EmbedHashTagStickerModel> c1ns3 = this.LJLJJL;
                if (c1ns3 != null) {
                    LiveState<V> LIZ3 = c1ns3.LIZ(new TBT() { // from class: X.6Tm
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((EmbedHashTagStickerModel) obj).getContentText();
                        }
                    });
                    LifecycleOwner lifecycleOwner3 = this.LJLJJLL;
                    if (lifecycleOwner3 == null) {
                        o.LJIJI("lifecycleOwner");
                        throw null;
                    }
                    LIZ3.LJIIIIZZ(lifecycleOwner3, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 13));
                    C1NS<EmbedHashTagStickerModel> c1ns4 = this.LJLJJL;
                    if (c1ns4 != null) {
                        LiveState<V> LIZ4 = c1ns4.LIZ(new TBT() { // from class: X.6Tb
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((EmbedHashTagStickerModel) obj).getClickable());
                            }
                        });
                        LifecycleOwner lifecycleOwner4 = this.LJLJJLL;
                        if (lifecycleOwner4 == null) {
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                        LIZ4.LJIIIIZZ(lifecycleOwner4, Lifecycle.State.STARTED, new C160956Tj(this));
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

    @Override // X.AbstractC161116Tz, X.C6UF
    public final void LIZIZ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LJLJJI = interactStickerStruct;
        LIZLLL();
        getContentEditText().setVisibility(8);
        removeAllViews();
        setBackgroundResource(R.drawable.a2v);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "image_sticker_embed_debug_tools", true, false);
        setAlpha(0.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C160946Ti(final android.content.Context r3, final X.C6UA r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 8
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160946Ti.<init>(android.content.Context, X.6UA, int):void");
    }
}
