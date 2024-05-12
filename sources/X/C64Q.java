package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.Space;
import com.tiktok.sticker.commonsticker.model.OptionsBean;
import com.tiktok.sticker.commonsticker.model.PollStickerModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.64Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64Q extends FrameLayout {
    public FrameLayout LJLIL;
    public C1547965r LJLILLLLZI;
    public C1547965r LJLJI;
    public C1547965r LJLJJI;
    public Space LJLJJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C64Q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final C1547965r getPollStickerOptionFirstEditText$tools_sticker_common_release() {
        C1547965r c1547965r = this.LJLJI;
        if (c1547965r != null) {
            return c1547965r;
        }
        o.LJIJI("pollStickerOptionFirstEditText");
        throw null;
    }

    public final C1547965r getPollStickerOptionSecondText$tools_sticker_common_release() {
        C1547965r c1547965r = this.LJLJJI;
        if (c1547965r != null) {
            return c1547965r;
        }
        o.LJIJI("pollStickerOptionSecondText");
        throw null;
    }

    public final C1547965r getPollStickerTitleEditText$tools_sticker_common_release() {
        C1547965r c1547965r = this.LJLILLLLZI;
        if (c1547965r != null) {
            return c1547965r;
        }
        o.LJIJI("pollStickerTitleEditText");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PollStickerModel getPollStruct() {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 7;
        arrayList.add(new OptionsBean(null, j, j, String.valueOf(getPollStickerOptionFirstEditText$tools_sticker_common_release().getText()), i, 0 == true ? 1 : 0));
        arrayList.add(new OptionsBean(null, j, j, String.valueOf(getPollStickerOptionSecondText$tools_sticker_common_release().getText()), i, 0 == true ? 1 : 0));
        return new PollStickerModel(String.valueOf(getPollStickerTitleEditText$tools_sticker_common_release().getText()), j, j, 0, j, arrayList, null, 94, 0 == true ? 1 : 0);
    }

    public final int getLastTouchedIndex() {
        if (getPollStickerTitleEditText$tools_sticker_common_release().LJLJL > getPollStickerOptionFirstEditText$tools_sticker_common_release().LJLJL) {
            if (getPollStickerTitleEditText$tools_sticker_common_release().LJLJL < getPollStickerOptionSecondText$tools_sticker_common_release().LJLJL && System.currentTimeMillis() - getPollStickerOptionSecondText$tools_sticker_common_release().LJLJL < 1000) {
                return 2;
            }
        } else if (getPollStickerOptionFirstEditText$tools_sticker_common_release().LJLJL > getPollStickerOptionSecondText$tools_sticker_common_release().LJLJL) {
            if (System.currentTimeMillis() - getPollStickerOptionFirstEditText$tools_sticker_common_release().LJLJL < 1000) {
                return 1;
            }
        } else if (System.currentTimeMillis() - getPollStickerOptionSecondText$tools_sticker_common_release().LJLJL < 1000) {
            return 2;
        }
        return 0;
    }

    public final void setEditEnable(boolean z) {
        getPollStickerTitleEditText$tools_sticker_common_release().setEnabled(z);
        C1547965r pollStickerOptionFirstEditText$tools_sticker_common_release = getPollStickerOptionFirstEditText$tools_sticker_common_release();
        pollStickerOptionFirstEditText$tools_sticker_common_release.setEnabled(z);
        pollStickerOptionFirstEditText$tools_sticker_common_release.setFocusable(z);
        pollStickerOptionFirstEditText$tools_sticker_common_release.setFocusableInTouchMode(z);
        C1547965r pollStickerOptionSecondText$tools_sticker_common_release = getPollStickerOptionSecondText$tools_sticker_common_release();
        pollStickerOptionSecondText$tools_sticker_common_release.setEnabled(z);
        pollStickerOptionSecondText$tools_sticker_common_release.setFocusable(z);
        pollStickerOptionSecondText$tools_sticker_common_release.setFocusableInTouchMode(z);
    }

    public final void setEditTextFocusable(int i) {
        getPollStickerTitleEditText$tools_sticker_common_release().setVisibility(0);
        Space space = this.LJLJJL;
        if (space != null) {
            space.setVisibility(0);
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    C78926UyI.LJJJJIZL(getPollStickerOptionSecondText$tools_sticker_common_release());
                    return;
                }
                C78926UyI.LJJJJIZL(getPollStickerOptionFirstEditText$tools_sticker_common_release());
                return;
            }
            C78926UyI.LJJJJIZL(getPollStickerTitleEditText$tools_sticker_common_release());
            return;
        }
        o.LJIJI("space");
        throw null;
    }

    public final void setPollStickerOptionFirstEditText$tools_sticker_common_release(C1547965r c1547965r) {
        o.LJIIIZ(c1547965r, "<set-?>");
        this.LJLJI = c1547965r;
    }

    public final void setPollStickerOptionSecondText$tools_sticker_common_release(C1547965r c1547965r) {
        o.LJIIIZ(c1547965r, "<set-?>");
        this.LJLJJI = c1547965r;
    }

    public final void setPollStickerTitleEditText$tools_sticker_common_release(C1547965r c1547965r) {
        o.LJIIIZ(c1547965r, "<set-?>");
        this.LJLILLLLZI = c1547965r;
    }

    public final void setTouchEnable(boolean z) {
        getPollStickerTitleEditText$tools_sticker_common_release().setMode(z);
        getPollStickerOptionFirstEditText$tools_sticker_common_release().setMode(z);
        getPollStickerOptionSecondText$tools_sticker_common_release().setMode(z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C64Q(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64Q.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
