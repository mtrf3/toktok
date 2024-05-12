package com.ss.android.ugc.aweme.inbox.adapter;

import X.AbstractC54715Ldf;
import X.C16880lQ;
import X.C30039Bqd;
import X.KL2;
import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class InboxLiveBaseCell<T extends AbstractC54715Ldf> extends PowerCell<T> {
    public static final /* synthetic */ int LJLIL = 0;

    public abstract void M();

    public abstract void P();

    public abstract void U();

    /* JADX WARN: Multi-variable type inference failed */
    public String N() {
        InboxLiveNotice LIZ;
        User user;
        String uid;
        AbstractC54715Ldf abstractC54715Ldf = (AbstractC54715Ldf) getItem();
        if (abstractC54715Ldf == null || (LIZ = abstractC54715Ldf.LIZ()) == null || (user = LIZ.getUser()) == null || (uid = user.getUid()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        AbstractC54715Ldf abstractC54715Ldf = (AbstractC54715Ldf) getItem();
        if (abstractC54715Ldf != null && abstractC54715Ldf.LIZIZ()) {
            U();
        }
        P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        AbstractC54715Ldf abstractC54715Ldf = (AbstractC54715Ldf) getItem();
        if (abstractC54715Ldf != null && abstractC54715Ldf.LIZIZ()) {
            M();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q */
    public void onBindItemView(T t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.itemView.setScaleX(1.0f);
        this.itemView.setScaleY(1.0f);
        C16880lQ.LJIIJ(new ACListenerS44S0200000_9(this, t, 13), this.itemView);
    }

    public final void T(TextView textView) {
        String str;
        try {
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "liveTag.context");
            try {
                LiveOuterService.LJJJLL().LJJIJIL().LJJIJIIJI().getClass();
                str = C30039Bqd.LIZ(context);
                o.LJIIIIZZ(str, "{\n            ServiceMan…String(context)\n        }");
            } catch (Exception unused) {
                str = "LIVE";
            }
            textView.setText(str);
            L(textView, str, 10.0f);
        } catch (Exception unused2) {
            textView.setText("LIVE");
            L(textView, "LIVE", 10.0f);
        }
    }

    public final void L(TextView textView, String str, float f) {
        textView.setTextSize(1, f);
        if (textView.getPaint().measureText(str) > KL2.LIZJ(textView.getContext(), 46.0f)) {
            float f2 = f - 1;
            if (f2 >= 9.0f) {
                L(textView, str, f2);
            }
        }
    }
}
