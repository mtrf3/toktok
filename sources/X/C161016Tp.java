package X;

import Y.ACListenerS22S0100000_2;
import Y.IDObjectS175S0100000_2;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161016Tp extends AbstractC161116Tz<SingleHashTagStickerModel> {
    public C1NS<SingleHashTagStickerModel> LJLJJL;
    public LifecycleOwner LJLJJLL;
    public T5T LJLJL;
    public TuxTextView LJLJLJ;

    @Override // X.AbstractC161116Tz, X.C6UF
    public final void LJFF() {
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 87)));
    }

    public final T5T getContentEditText() {
        T5T t5t = this.LJLJL;
        if (t5t != null) {
            return t5t;
        }
        o.LJIJI("contentEditText");
        throw null;
    }

    public final TuxTextView getContentTextView() {
        TuxTextView tuxTextView = this.LJLJLJ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("contentTextView");
        throw null;
    }

    public final void LIZLLL() {
        C16880lQ.LLLZIIL(R.layout.azh, C16880lQ.LLZIL(getContext()), this);
        View findViewById = findViewById(R.id.d04);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.ev_lay…shtag_sticker_input_view)");
        setContentEditText((T5T) findViewById);
        View findViewById2 = findViewById(R.id.d05);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.ev_lay…ashtag_sticker_text_view)");
        setContentTextView((TuxTextView) findViewById2);
    }

    public final void setContentEditText(T5T t5t) {
        o.LJIIIZ(t5t, "<set-?>");
        this.LJLJL = t5t;
    }

    public final void setContentTextView(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJLJ = tuxTextView;
    }

    public final void LIZ(C1NS<SingleHashTagStickerModel> container, LifecycleOwner owner) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(owner, "owner");
        this.LJLJJL = container;
        this.LJLJJLL = owner;
        LIZLLL();
        getContentEditText().addTextChangedListener(new IDObjectS175S0100000_2(this, 7));
        C1NS<SingleHashTagStickerModel> c1ns = this.LJLJJL;
        if (c1ns != null) {
            LiveState<V> LIZ = c1ns.LIZ(new TBT() { // from class: X.6Tf
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((SingleHashTagStickerModel) obj).getVisible());
                }
            });
            LifecycleOwner lifecycleOwner = this.LJLJJLL;
            if (lifecycleOwner == null) {
                o.LJIJI("lifecycleOwner");
                throw null;
            }
            LIZ.LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 369));
            C1NS<SingleHashTagStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                LiveState<V> LIZ2 = c1ns2.LIZ(new TBT() { // from class: X.6Tg
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((SingleHashTagStickerModel) obj).getEditable());
                    }
                });
                LifecycleOwner lifecycleOwner2 = this.LJLJJLL;
                if (lifecycleOwner2 == null) {
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
                LIZ2.LJIIIIZZ(lifecycleOwner2, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 370));
                C1NS<SingleHashTagStickerModel> c1ns3 = this.LJLJJL;
                if (c1ns3 != null) {
                    LiveState<V> LIZ3 = c1ns3.LIZ(new TBT() { // from class: X.6Tu
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((SingleHashTagStickerModel) obj).getContentText();
                        }
                    });
                    LifecycleOwner lifecycleOwner3 = this.LJLJJLL;
                    if (lifecycleOwner3 == null) {
                        o.LJIJI("lifecycleOwner");
                        throw null;
                    }
                    LIZ3.LJIIIIZZ(lifecycleOwner3, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 371));
                    C1NS<SingleHashTagStickerModel> c1ns4 = this.LJLJJL;
                    if (c1ns4 != null) {
                        LiveState<V> LIZ4 = c1ns4.LIZ(new TBT() { // from class: X.6Th
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((SingleHashTagStickerModel) obj).getClickable());
                            }
                        });
                        LifecycleOwner lifecycleOwner4 = this.LJLJJLL;
                        if (lifecycleOwner4 == null) {
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                        LIZ4.LJIIIIZZ(lifecycleOwner4, Lifecycle.State.STARTED, new C161036Tr(this));
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
        String hashtagName;
        this.LJLJJI = interactStickerStruct;
        LIZLLL();
        getContentEditText().setVisibility(8);
        getContentTextView().setVisibility(0);
        getContentTextView().setGravity(17);
        HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
        if (hashtagInfo != null && (hashtagName = hashtagInfo.getHashtagName()) != null) {
            getContentTextView().setText(hashtagName);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C161016Tp(android.content.Context r3, X.C6UA r4, int r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C161016Tp.<init>(android.content.Context, X.6UA, int):void");
    }
}
