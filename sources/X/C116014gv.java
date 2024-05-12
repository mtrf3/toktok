package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;

/* renamed from: X.4gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116014gv {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Object LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;

    public C116014gv(TemplateData templateData) {
        Object obj;
        Object obj2;
        Object obj3 = null;
        if (templateData != null) {
            obj = templateData.getImageUrl();
            if (obj == null) {
                obj = templateData.getLocalImageUrl();
            }
        } else {
            obj = null;
        }
        this.LIZ = obj;
        if (templateData != null) {
            obj2 = templateData.getBadgeUrl();
            if (obj2 == null) {
                obj2 = templateData.getLocalBadgeUrl();
            }
        } else {
            obj2 = null;
        }
        this.LIZIZ = obj2;
        if (templateData != null && (obj3 = templateData.getTitle()) == null) {
            obj3 = templateData.getLocalTitle();
        }
        this.LIZJ = obj3;
    }
}
