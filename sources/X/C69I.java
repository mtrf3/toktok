package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.69I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69I extends AbstractC65781Prl implements InterfaceC65784Pro<C69A> {
    public static final C69I LJLIL = new C69I();

    public C69I() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.69A] */
    @Override // X.InterfaceC65784Pro
    public final C69A invoke() {
        InterfaceC84498XEg createFontEffectPlatform;
        ?? r3 = new Object() { // from class: X.69A
            public final void LIZ(AnonymousClass634 anonymousClass634, InterfaceC84498XEg interfaceC84498XEg, C6FB c6fb, C68P c68p) {
                if (AnonymousClass699.LJ) {
                    return;
                }
                AnonymousClass699.LIZ = anonymousClass634;
                AnonymousClass699.LIZIZ = interfaceC84498XEg;
                AnonymousClass699.LIZJ = c6fb;
                AnonymousClass699.LIZLLL = c68p;
                AnonymousClass699.LJ = true;
            }
        };
        AnonymousClass631 anonymousClass631 = new AnonymousClass631(e1.LIZ(31744, "edit_text_sticker_stroke_mode", true, false), C138535c9.LIZ(), 124);
        C44384HbQ c44384HbQ = new C44384HbQ();
        boolean LIZ = C6FR.LIZ();
        Boolean bool = C41658GWo.LIZLLL().LJ;
        o.LJIIIIZZ(bool, "inst().isInShoutout");
        boolean booleanValue = bool.booleanValue();
        boolean LIZIZ = C6IG.LIZIZ(C6IE.EDIT_PAGE_PANEL);
        List list = null;
        try {
            String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("qa_sticker_regular", String[].class, null);
            if (strArr != null) {
                list = ORY.LJJZZIII(strArr);
            }
        } catch (Throwable unused) {
        }
        AnonymousClass634 anonymousClass634 = new AnonymousClass634(anonymousClass631, c44384HbQ, LIZ, booleanValue, LIZIZ, list);
        IEffectService effectService = AVServiceImpl.LIZ().effectService();
        if (effectService != null && (createFontEffectPlatform = effectService.createFontEffectPlatform(C60903NvH.LJ)) != null) {
            r3.LIZ(anonymousClass634, createFontEffectPlatform, AnonymousClass668.LIZIZ(), new C68P() { // from class: X.68g
                @Override // X.C68P
                public final void LIZ(TextFontStyleData textFontStyleData, boolean z, Exception exc) {
                    String LJII;
                    if (z) {
                        C6BK c6bk = new C6BK();
                        c6bk.LIZ.put("font_title", textFontStyleData.title);
                        c6bk.LIZ.put("font_name", textFontStyleData.fileName);
                        C43882HKc.LIZLLL(0, "font_resource_download_error_state", c6bk.LJ(), C48331Ixz.LJ());
                        return;
                    }
                    C6BK c6bk2 = new C6BK();
                    c6bk2.LIZ.put("font_title", textFontStyleData.title);
                    c6bk2.LIZ.put("font_name", textFontStyleData.fileName);
                    if (exc == null) {
                        LJII = "";
                    } else {
                        LJII = J7I.LJII(exc);
                    }
                    c6bk2.LIZ.put("exception", LJII);
                    C43882HKc.LIZLLL(1, "font_resource_download_error_state", c6bk2.LJ(), C48331Ixz.LJ());
                }
            });
        }
        return r3;
    }
}
