package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RichBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.XLLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ase, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27616Ase extends C5XB {
    @Override // X.C5XB
    public final Image LIZ() {
        RichBlock richBlock = (RichBlock) ORZ.LJLLLL(this.LIZ);
        if (richBlock != null) {
            return richBlock.image;
        }
        return null;
    }

    @Override // X.C5XB
    public final boolean LIZLLL() {
        RichBlock richBlock = (RichBlock) ORZ.LJLLLL(this.LIZ);
        if (richBlock == null) {
            return false;
        }
        Integer num = richBlock.richBlockType;
        int value = EnumC27622Ask.IMAGE.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }

    @Override // X.C5XB
    public final List<InterfaceC27624Asm> LJ() {
        XLLinkRichText xLLinkRichText;
        List<LogisticLinkRichText> list;
        List<RichBlock> list2 = this.LIZ;
        ArrayList LJ = AnonymousClass391.LJ(list2, "details");
        for (RichBlock richBlock : list2) {
            Integer num = richBlock.richBlockType;
            int value = EnumC27622Ask.RICH_TEXT.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = EnumC27622Ask.IMAGE.getValue();
                if (num == null || num.intValue() != value2) {
                    int value3 = EnumC27622Ask.XL_TEXT.getValue();
                    if (num != null && num.intValue() == value3 && (xLLinkRichText = richBlock.xlLinkRichText) != null && (list = xLLinkRichText.liTexts) != null) {
                        Integer num2 = xLLinkRichText.xlType;
                        int value4 = EnumC27623Asl.UL.getValue();
                        if (num2 == null || num2.intValue() != value4) {
                            Integer num3 = xLLinkRichText.xlType;
                            int value5 = EnumC27623Asl.OL.getValue();
                            if (num3 != null && num3.intValue() == value5) {
                                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                                int i = 0;
                                for (LogisticLinkRichText logisticLinkRichText : list) {
                                    i++;
                                    RichTextUtil.LIZ.getClass();
                                    arrayList.add(new C27172AlU(RichTextUtil.LIZIZ(logisticLinkRichText), "ol", (Integer) null, i, (String) null, logisticLinkRichText, 52));
                                }
                                LJ.addAll(arrayList);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
                            for (LogisticLinkRichText logisticLinkRichText2 : list) {
                                RichTextUtil.LIZ.getClass();
                                arrayList2.add(new C27172AlU(RichTextUtil.LIZIZ(logisticLinkRichText2), "ul", (Integer) null, 0, (String) null, logisticLinkRichText2, 60));
                            }
                            LJ.addAll(arrayList2);
                        }
                    }
                } else {
                    Image image = richBlock.image;
                    if (image != null && image.getUrls() != null) {
                        LJ.add(new C27177AlZ(richBlock.image));
                    }
                }
            } else {
                LogisticLinkRichText logisticLinkRichText3 = richBlock.linkRichText;
                if (logisticLinkRichText3 != null) {
                    RichTextUtil.LIZ.getClass();
                    LJ.add(new C27172AlU(RichTextUtil.LIZIZ(logisticLinkRichText3), "text", (Integer) null, 0, (String) null, richBlock.linkRichText, 60));
                }
            }
        }
        return LJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27616Ase(List<RichBlock> details) {
        super(details);
        o.LJIIIZ(details, "details");
    }
}
