package com.ss.android.ugc.profile.platform.base.data;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C2068389v;
import X.InterfaceC65349Pkn;
import X.W5F;
import X.W5U;
import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class Icon implements Serializable {
    public final String LJLIL = "Profile.Icon";

    @InterfaceC65349Pkn("icon_key")
    public String localIcon;

    @InterfaceC65349Pkn("icon_url")
    public String remoteIcon;

    @InterfaceC65349Pkn("icon_url_dark")
    public String remoteIconDark;

    public final String getLocalIcon() {
        return this.localIcon;
    }

    public final String getRemoteIcon() {
        return this.remoteIcon;
    }

    public final String getRemoteIconDark() {
        return this.remoteIconDark;
    }

    public final String getTag() {
        return this.LJLIL;
    }

    public final String getIconUrl(Context context) {
        o.LJIIIZ(context, "context");
        if (AnonymousClass636.LJIILJJIL(context)) {
            return this.remoteIconDark;
        }
        return this.remoteIcon;
    }

    public final void setLocalIcon(String str) {
        this.localIcon = str;
    }

    public final void setRemoteIcon(String str) {
        this.remoteIcon = str;
    }

    public final void setRemoteIconDark(String str) {
        this.remoteIconDark = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0015, B:12:0x0029, B:15:0x0031), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer getIconInt(java.lang.String r5, java.lang.Integer r6) {
        /*
            r4 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = r4.localIcon     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L12
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            if (r0 != 0) goto L36
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Throwable -> L37
            android.content.res.Resources r2 = r0.getResources()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r4.localIcon     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L37
            int r0 = r2.getIdentifier(r1, r5, r0)     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L31
            java.lang.String r1 = "get local icon id is 0"
            java.lang.String r0 = r4.localIcon     // Catch: java.lang.Throwable -> L37
            X.C237259Sv.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L37
            return r6
        L31:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L37
            return r0
        L36:
            return r6
        L37:
            r3 = move-exception
            java.lang.String r2 = r4.LJLIL
            java.lang.String r1 = "getIconInt error, type: "
            java.lang.String r0 = ", exp: "
            java.lang.StringBuilder r1 = X.C25620zW.LIZIZ(r1, r5, r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LIZIZ(r2, r0)
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto L58
            java.lang.String r1 = "get local icon error"
        L58:
            java.lang.String r0 = r4.localIcon
            X.C237259Sv.LJFF(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.data.Icon.getIconInt(java.lang.String, java.lang.Integer):java.lang.Integer");
    }

    public static /* synthetic */ Integer getIconInt$default(Icon icon, String str, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "raw";
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return icon.getIconInt(str, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIconInt");
    }

    public final void setIconToImageView(TuxIconView imageView, String type, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        String str;
        int width;
        int height;
        o.LJIIIZ(imageView, "imageView");
        o.LJIIIZ(type, "type");
        Context context = imageView.getContext();
        if (context != null) {
            str = getIconUrl(context);
        } else {
            str = null;
        }
        int i = 0;
        if (str == null || str.length() == 0) {
            if (z) {
                Integer iconInt = getIconInt(type, num);
                if (iconInt != null) {
                    i = iconInt.intValue();
                }
                imageView.setIconRes(i);
                return;
            }
            C2068389v c2068389v = new C2068389v();
            Integer iconInt2 = getIconInt(type, num);
            if (iconInt2 != null) {
                i = iconInt2.intValue();
            }
            c2068389v.LIZ = i;
            if (num3 != null) {
                width = num3.intValue();
            } else {
                width = imageView.getWidth();
            }
            c2068389v.LIZIZ = width;
            if (num4 != null) {
                height = num4.intValue();
            } else {
                height = imageView.getHeight();
            }
            c2068389v.LIZJ = height;
            if (num2 != null) {
                c2068389v.LJ = num2;
            }
            imageView.setTuxIcon(c2068389v);
            return;
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJJIIJZLJL = imageView;
        LJIIIIZZ.LJIILIIL = imageView.getDrawable();
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    public static /* synthetic */ void setIconToImageView$default(Icon icon, TuxIconView tuxIconView, String str, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i, Object obj) {
        Integer num5 = num;
        String str2 = str;
        Integer num6 = num2;
        Integer num7 = num3;
        boolean z2 = z;
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = "raw";
            }
            Integer num8 = null;
            if ((i & 4) != 0) {
                num5 = null;
            }
            if ((i & 8) != 0) {
                num6 = null;
            }
            if ((i & 16) != 0) {
                num7 = null;
            }
            if ((i & 32) == 0) {
                num8 = num4;
            }
            if ((i & 64) != 0) {
                z2 = false;
            }
            icon.setIconToImageView(tuxIconView, str2, num5, num6, num7, num8, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconToImageView");
    }
}
