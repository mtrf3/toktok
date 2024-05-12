package Y;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C188727au;
import X.C1I1;
import X.C6ZT;
import X.C8HI;
import X.FMX;
import X.InterfaceC88472Yns;
import X.LBQ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupBodyLinkList;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDCSpanS1S0200000_3 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                return;
            case 1:
                updateDrawState$1(this, textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public static final void onClick$0(IDCSpanS1S0200000_3 iDCSpanS1S0200000_3, View widget) {
        UniversalPopupAction action;
        String actionId;
        o.LJIIIZ(widget, "widget");
        UniversalPopupBodyLinkList universalPopupBodyLinkList = (UniversalPopupBodyLinkList) iDCSpanS1S0200000_3.l0;
        if (universalPopupBodyLinkList == null || (action = universalPopupBodyLinkList.getAction()) == null || (actionId = action.getActionId()) == null) {
            return;
        }
        ((InterfaceC88472Yns) iDCSpanS1S0200000_3.l1).invoke(actionId);
    }

    public static final void onClick$1(IDCSpanS1S0200000_3 iDCSpanS1S0200000_3, View view) {
        o.LJIIIZ(view, "view");
        ((View.OnClickListener) iDCSpanS1S0200000_3.l0).onClick(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.IDCSpanS1S0200000_3 r9, android.view.View r10) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCSpanS1S0200000_3.onClick$2(Y.IDCSpanS1S0200000_3, android.view.View):void");
    }

    public static final void onClick$3(IDCSpanS1S0200000_3 iDCSpanS1S0200000_3, View v) {
        Activity activity;
        o.LJIIIZ(v, "v");
        if (C6ZT.LIZ(v)) {
            return;
        }
        MobClick LIZLLL = C1I1.LIZLLL("edit_title", "song_cover");
        LIZLLL.setValue(String.valueOf(((Music) iDCSpanS1S0200000_3.l0).getId()));
        FMX.onEvent(LIZLLL);
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("original_title_click");
        obtain.setLabelName("original_music");
        FMX.onEvent(obtain);
        C188727au c188727au = new C188727au();
        c188727au.LJ(((Music) iDCSpanS1S0200000_3.l0).getId(), "music_id");
        c188727au.LJIIIZ("enter_from", "single_song");
        FMX.LJIIL("click_edit_sound_name", c188727au.LIZ);
        Intent intent = new Intent((Context) iDCSpanS1S0200000_3.l1, (Class<?>) EditOriginMusicTitleActivity.class);
        intent.putExtra("MUSIC_TITLE", String.valueOf(((Music) iDCSpanS1S0200000_3.l0).getId()));
        Context context = (Context) iDCSpanS1S0200000_3.l1;
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            C16880lQ.LJFF(activity, 0, intent);
        }
    }

    public static final void updateDrawState$0(IDCSpanS1S0200000_3 iDCSpanS1S0200000_3, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS1S0200000_3 iDCSpanS1S0200000_3, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        Context context = ((LBQ) iDCSpanS1S0200000_3.l1).getContext();
        o.LJIIIIZZ(context, "context");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.d4, context));
        ds.setUnderlineText(false);
        ds.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
    }

    public IDCSpanS1S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
