package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import kotlin.jvm.internal.o;

/* renamed from: X.5ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152565ym extends AbstractC65781Prl implements InterfaceC88472Yns<InlineRichTextStyleData, Boolean> {
    public static final C152565ym LJLIL = new C152565ym();

    public C152565ym() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InlineRichTextStyleData inlineRichTextStyleData) {
        InlineRichTextStyleData it = inlineRichTextStyleData;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(it.inlineStyle instanceof ForegroundColorStyle);
    }
}
