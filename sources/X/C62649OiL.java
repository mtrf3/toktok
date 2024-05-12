package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.RadioGroup;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.silent.SilentSharePopupWindow;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OiL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62649OiL implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ AbstractC62647OiJ LIZ;

    public C62649OiL(AbstractC62647OiJ abstractC62647OiJ) {
        this.LIZ = abstractC62647OiJ;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2;
        int width;
        SilentSharePopupWindow silentSharePopupWindow;
        AbstractC62647OiJ abstractC62647OiJ = this.LIZ;
        if (abstractC62647OiJ.LJLLI == i) {
            return;
        }
        int i3 = 0;
        if (i == -1 && !SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
            C1A7.LJIIL().LJ("key_silent_share_save", 0);
        }
        int i4 = 1;
        if (!abstractC62647OiJ.LJLJJL) {
            abstractC62647OiJ.LJLJJL = true;
            AVExternalServiceImpl.LIZ().publishService().cancelSynthesis(abstractC62647OiJ.getContext(), "base_sync_share_view_v2");
        }
        SilentSharePopupWindow silentSharePopupWindow2 = abstractC62647OiJ.LJLJLLL;
        Throwable th = null;
        if (silentSharePopupWindow2 != null && silentSharePopupWindow2.isShowing()) {
            try {
                SilentSharePopupWindow silentSharePopupWindow3 = abstractC62647OiJ.LJLJLLL;
                if (silentSharePopupWindow3 != null) {
                    silentSharePopupWindow3.dismiss();
                } else {
                    o.LJIJI("popupWindow");
                    throw null;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        for (OSZ<EnumC62419Oed, C63046Ook> osz : abstractC62647OiJ.getButtonPairList()) {
            if (osz.getSecond().getId() == i) {
                C1A7.LJIIL().LJ("key_silent_share_save", osz.getFirst().getSaveType());
                C63046Ook view = osz.getSecond();
                String label = osz.getFirst().getLabel();
                o.LJIIIZ(view, "view");
                o.LJIIIZ(label, "label");
                if (C1A7.LJIIL().LIZ(i3, "key_pop_up_window_share_count") < 3 && (i2 = abstractC62647OiJ.LJLL) > 0) {
                    abstractC62647OiJ.LJLL = i2 - 1;
                    SilentSharePopupWindow silentSharePopupWindow4 = abstractC62647OiJ.LJLJLLL;
                    if (silentSharePopupWindow4 != null && silentSharePopupWindow4.isShowing()) {
                        SilentSharePopupWindow silentSharePopupWindow5 = abstractC62647OiJ.LJLJLLL;
                        if (silentSharePopupWindow5 != null) {
                            silentSharePopupWindow5.dismiss();
                        } else {
                            o.LJIJI("popupWindow");
                            throw th;
                        }
                    }
                    Context context = abstractC62647OiJ.getContext();
                    o.LJIIIIZZ(context, "context");
                    Resources resources = abstractC62647OiJ.getResources();
                    Object[] objArr = new Object[i4];
                    objArr[i3] = label;
                    String string = resources.getString(R.string.pxy, objArr);
                    o.LJIIIIZZ(string, "resources.getString(R.st…direct_share_hint, label)");
                    SilentSharePopupWindow silentSharePopupWindow6 = new SilentSharePopupWindow(context, string, (int) KL2.LIZJ(abstractC62647OiJ.getContext(), 3.0f));
                    abstractC62647OiJ.LJLJLLL = silentSharePopupWindow6;
                    silentSharePopupWindow6.getContentView().measure(i3, i3);
                    float LIZJ = KL2.LIZJ(abstractC62647OiJ.getContext(), 10.0f);
                    SilentSharePopupWindow silentSharePopupWindow7 = abstractC62647OiJ.LJLJLLL;
                    if (silentSharePopupWindow7 != null) {
                        int measuredWidth = silentSharePopupWindow7.getContentView().getMeasuredWidth();
                        SilentSharePopupWindow silentSharePopupWindow8 = abstractC62647OiJ.LJLJLLL;
                        if (silentSharePopupWindow8 != null) {
                            int measuredHeight = silentSharePopupWindow8.getContentView().getMeasuredHeight();
                            SilentSharePopupWindow silentSharePopupWindow9 = abstractC62647OiJ.LJLJLLL;
                            if (silentSharePopupWindow9 != null) {
                                ImageView imageView = (ImageView) silentSharePopupWindow9.getContentView().findViewById(R.id.eyv);
                                SilentSharePopupWindow silentSharePopupWindow10 = abstractC62647OiJ.LJLJLLL;
                                if (silentSharePopupWindow10 != null) {
                                    ImageView imageView2 = (ImageView) silentSharePopupWindow10.getContentView().findViewById(R.id.eyw);
                                    Context context2 = abstractC62647OiJ.getContext();
                                    o.LJIIIIZZ(context2, "context");
                                    imageView.setColorFilter(AnonymousClass636.LJIIIIZZ(R.attr.eh, context2));
                                    Context context3 = abstractC62647OiJ.getContext();
                                    o.LJIIIIZZ(context3, "context");
                                    imageView2.setColorFilter(AnonymousClass636.LJIIIIZZ(R.attr.eh, context3));
                                    int[] iArr = new int[2];
                                    view.getLocationOnScreen(iArr);
                                    int LJIIJJI = KL2.LJIIJJI(abstractC62647OiJ.LJLJI);
                                    int i5 = measuredWidth / 2;
                                    float width2 = (view.getWidth() / 2) + iArr[0];
                                    if (i5 + LIZJ > width2) {
                                        width = (int) (LIZJ - iArr[0]);
                                        imageView.getLayoutParams().width = (int) (width2 - LIZJ);
                                        imageView2.getLayoutParams().width = measuredWidth - imageView.getLayoutParams().width;
                                    } else {
                                        float f = LJIIJJI - LIZJ;
                                        if (r15 + i5 > f) {
                                            width = (int) (f - (iArr[0] + measuredWidth));
                                            imageView2.getLayoutParams().width = (int) (f - width2);
                                            imageView.getLayoutParams().width = measuredWidth - imageView2.getLayoutParams().width;
                                        } else {
                                            width = (view.getWidth() - measuredWidth) / 2;
                                            imageView.getLayoutParams().width = i5;
                                            imageView2.getLayoutParams().width = i5;
                                        }
                                    }
                                    imageView.getLayoutParams().height = measuredHeight;
                                    imageView2.getLayoutParams().height = measuredHeight;
                                    SilentSharePopupWindow silentSharePopupWindow11 = abstractC62647OiJ.LJLJLLL;
                                    if (silentSharePopupWindow11 != null) {
                                        silentSharePopupWindow11.getContentView().measure(0, 0);
                                        silentSharePopupWindow11.LJLJJI = silentSharePopupWindow11.getContentView().getMeasuredHeight();
                                        silentSharePopupWindow11.getContentView().getMeasuredWidth();
                                        try {
                                            silentSharePopupWindow = abstractC62647OiJ.LJLJLLL;
                                        } catch (Exception unused2) {
                                        }
                                        if (silentSharePopupWindow != null) {
                                            SilentSharePopupWindow.LIZ(silentSharePopupWindow, view, width);
                                            th = null;
                                        } else {
                                            o.LJIJI("popupWindow");
                                            th = null;
                                            try {
                                                throw null;
                                                break;
                                            } catch (Exception unused3) {
                                            }
                                        }
                                    } else {
                                        o.LJIJI("popupWindow");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("popupWindow");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("popupWindow");
                                throw null;
                            }
                        } else {
                            o.LJIJI("popupWindow");
                            throw null;
                        }
                    } else {
                        o.LJIJI("popupWindow");
                        throw null;
                    }
                }
                abstractC62647OiJ.LJIIJJI(osz.getFirst().getKey(), true);
            }
            if (osz.getSecond().getId() == abstractC62647OiJ.LJLLI) {
                abstractC62647OiJ.LJIIJJI(osz.getFirst().getKey(), false);
            }
            i3 = 0;
            i4 = 1;
        }
        abstractC62647OiJ.LJLLI = i;
    }
}
