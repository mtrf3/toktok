package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GQh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41495GQh extends GQF<AVTextExtraStruct> {
    public static final /* synthetic */ int LIZJ = 0;
    public final GQU LIZIZ;

    public C41495GQh(GQU gqu) {
        this.LIZIZ = gqu;
    }

    public final void LJ(AbstractC41508GQu abstractC41508GQu) {
        this.LIZ.addLast(abstractC41508GQu);
    }

    @Override // X.GQF
    public final /* bridge */ /* synthetic */ C41495GQh LIZIZ(CharSequence charSequence, Iterable iterable) {
        LJI(charSequence, iterable);
        return this;
    }

    @Override // X.GQF
    public final List<AbstractC41507GQt<AVTextExtraStruct>> LIZJ(CharSequence markupText, List<? extends AVTextExtraStruct> metadata) {
        o.LJIIIZ(markupText, "markupText");
        o.LJIIIZ(metadata, "metadata");
        try {
            return new C41496GQi(markupText, metadata, this.LIZIZ).LJ(false);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("markupText: ");
            LIZ.append((Object) markupText);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("TiktokLexicalTextBlockFactory", LIZIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("metadata: ");
            LIZ2.append(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), metadata));
            I9A.LIZJ("TiktokLexicalTextBlockFactory", X1D.LIZIZ(LIZ2));
            GB5.Companion.getClass();
            throw new GB5(LIZIZ, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(CharSequence displayText, Iterable textMetadata) {
        o.LJIIIZ(displayText, "displayText");
        o.LJIIIZ(textMetadata, "textMetadata");
        this.LIZ.clear();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        for (Object obj : textMetadata) {
            int i4 = i3 + 1;
            C41509GQv c41509GQv = null;
            c41509GQv = null;
            c41509GQv = null;
            c41509GQv = null;
            if (i3 >= 0) {
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
                if (i >= i2) {
                    i2 = -1;
                }
                if (LJFF(i, aVTextExtraStruct.start, i2, displayText)) {
                    i = aVTextExtraStruct.start;
                }
                if (aVTextExtraStruct.isTransient()) {
                    i2 = aVTextExtraStruct.end;
                    int i5 = aVTextExtraStruct.subType;
                    if (i5 != 1 && i5 != 2 && i5 != 5 && i5 != 7) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Unsupported transient text block type(subType=");
                        LIZ.append(aVTextExtraStruct.subType);
                        LIZ.append("), struct=");
                        LIZ.append(aVTextExtraStruct);
                        throw new GB5(X1D.LIZIZ(LIZ), null, 2, null);
                    }
                } else {
                    int i6 = aVTextExtraStruct.type;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 == 5) {
                                int i7 = aVTextExtraStruct.start;
                                int i8 = aVTextExtraStruct.end;
                                String str = aVTextExtraStruct.awemeId;
                                o.LJI(str);
                                String str2 = aVTextExtraStruct.userId;
                                o.LJI(str2);
                                C41509GQv c41509GQv2 = new C41509GQv(i7, i8, str, new C41506GQs(str2, aVTextExtraStruct.getSecUid()));
                                String displayName = displayText.subSequence(aVTextExtraStruct.start + 1, aVTextExtraStruct.end).toString();
                                o.LJIIIZ(displayName, "displayName");
                                c41509GQv2.LJIIJJI = displayName;
                                c41509GQv = c41509GQv2;
                            } else {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Unsupported text block type(type=");
                                LIZ2.append(aVTextExtraStruct.type);
                                LIZ2.append("), struct=");
                                LIZ2.append(aVTextExtraStruct);
                                throw new GB5(X1D.LIZIZ(LIZ2), null, 2, null);
                            }
                        } else {
                            GR9 gr9 = new GR9(aVTextExtraStruct.start, aVTextExtraStruct.end);
                            String str3 = aVTextExtraStruct.hashTagName;
                            o.LJI(str3);
                            gr9.LJIIIZ = str3;
                            c41509GQv = gr9;
                        }
                    } else {
                        int i9 = aVTextExtraStruct.subType;
                        if (i9 == 1 || i9 == 1) {
                            int i10 = aVTextExtraStruct.start;
                            int i11 = aVTextExtraStruct.end;
                            String str4 = aVTextExtraStruct.awemeId;
                            o.LJI(str4);
                            String str5 = aVTextExtraStruct.userId;
                            o.LJI(str5);
                            C41509GQv c41509GQv3 = new C41509GQv(i10, i11, str4, new C41506GQs(str5, aVTextExtraStruct.getSecUid()));
                            String displayName2 = displayText.subSequence(aVTextExtraStruct.start + 1, aVTextExtraStruct.end).toString();
                            o.LJIIIZ(displayName2, "displayName");
                            c41509GQv3.LJIIJJI = displayName2;
                            c41509GQv = c41509GQv3;
                        } else {
                            int i12 = aVTextExtraStruct.start;
                            int i13 = aVTextExtraStruct.end;
                            String str6 = aVTextExtraStruct.userId;
                            o.LJI(str6);
                            C41512GQy c41512GQy = new C41512GQy(i12, i13, new C41506GQs(str6, aVTextExtraStruct.getSecUid()));
                            String displayName3 = displayText.subSequence(aVTextExtraStruct.start + 1, aVTextExtraStruct.end).toString();
                            o.LJIIIZ(displayName3, "displayName");
                            c41512GQy.LJIIJJI = displayName3;
                            c41509GQv = c41512GQy;
                        }
                    }
                }
                LIZLLL(c41509GQv, aVTextExtraStruct, false);
                if (!aVTextExtraStruct.isTransient()) {
                    i = aVTextExtraStruct.end;
                }
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LJFF(i, displayText.length(), i2, displayText);
    }

    public final void LIZLLL(AbstractC41508GQu abstractC41508GQu, AVTextExtraStruct aVTextExtraStruct, boolean z) {
        int i;
        AbstractC41508GQu gr3;
        EnumC35470Dw2 enumC35470Dw2;
        EnumC35470Dw2 enumC35470Dw22;
        EnumC35470Dw2 enumC35470Dw23;
        EnumC35470Dw2 enumC35470Dw24;
        AbstractC41508GQu gr32;
        if (abstractC41508GQu == null) {
            if (aVTextExtraStruct != null) {
                int i2 = aVTextExtraStruct.subType;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 5) {
                            if (i2 != 7) {
                                return;
                            } else {
                                gr32 = new GR0(0);
                            }
                        } else {
                            gr32 = new GR1(0);
                        }
                    } else {
                        gr32 = new C41513GQz(0);
                    }
                } else if (aVTextExtraStruct.isDuet()) {
                    gr32 = new GR2(0);
                } else {
                    gr32 = new GR3(0);
                }
                gr32.LJJIIJ(EnumC35470Dw2.LTR);
                LJ(gr32);
                return;
            }
            throw new GB5("Metadata of transient text block should not be null", null, 2, null);
        }
        if (z) {
            LJ(abstractC41508GQu);
            return;
        }
        if (aVTextExtraStruct != null) {
            i = aVTextExtraStruct.subType;
        } else {
            i = 0;
        }
        AbstractC41507GQt abstractC41507GQt = (AbstractC41507GQt) this.LIZ.LJIILJJIL();
        if (abstractC41507GQt != null && abstractC41507GQt.LIZ(abstractC41508GQu)) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                LJ(abstractC41508GQu);
                                return;
                            }
                            GR0 gr0 = new GR0(0);
                            if (gr0.LIZ(abstractC41508GQu)) {
                                while (true) {
                                    EnumC35470Dw2 enumC35470Dw25 = gr0.LJII;
                                    enumC35470Dw24 = EnumC35470Dw2.RTL;
                                    if (enumC35470Dw25 != enumC35470Dw24 || !(!this.LIZ.isEmpty()) || !gr0.LIZ((AbstractC41507GQt) this.LIZ.last())) {
                                        break;
                                    } else {
                                        this.LIZ.removeLast();
                                    }
                                }
                                if (gr0.LJIIJJI()) {
                                    gr0.LJJIIJ(enumC35470Dw24);
                                }
                                LJ(gr0);
                                return;
                            }
                            throw new GB5("type is ReplyStickerChain Block but not accepting! there may be something wrong.", null, 2, null);
                        }
                    } else {
                        GR1 gr1 = new GR1(0);
                        if (gr1.LIZ(abstractC41508GQu)) {
                            while (true) {
                                EnumC35470Dw2 enumC35470Dw26 = gr1.LJII;
                                enumC35470Dw23 = EnumC35470Dw2.RTL;
                                if (enumC35470Dw26 != enumC35470Dw23 || !(!this.LIZ.isEmpty()) || !gr1.LIZ((AbstractC41507GQt) this.LIZ.last())) {
                                    break;
                                } else {
                                    this.LIZ.removeLast();
                                }
                            }
                            if (gr1.LJIIJJI()) {
                                gr1.LJJIIJ(enumC35470Dw23);
                            }
                            LJ(gr1);
                            return;
                        }
                        throw new GB5("type is QuestionStickerChain Block but not accepting! there may be something wrong.", null, 2, null);
                    }
                } else {
                    C41513GQz c41513GQz = new C41513GQz(0);
                    if (c41513GQz.LIZ(abstractC41508GQu)) {
                        while (true) {
                            EnumC35470Dw2 enumC35470Dw27 = c41513GQz.LJII;
                            enumC35470Dw22 = EnumC35470Dw2.RTL;
                            if (enumC35470Dw27 != enumC35470Dw22 || !(!this.LIZ.isEmpty()) || !c41513GQz.LIZ((AbstractC41507GQt) this.LIZ.last())) {
                                break;
                            } else {
                                this.LIZ.removeLast();
                            }
                        }
                        if (c41513GQz.LJIIJJI()) {
                            c41513GQz.LJJIIJ(enumC35470Dw22);
                        }
                        LJ(c41513GQz);
                        return;
                    }
                    throw new GB5("type is ReplyCommentChain Block but not accepting! there may be something wrong.", null, 2, null);
                }
            } else {
                if (aVTextExtraStruct == null) {
                    return;
                }
                if (aVTextExtraStruct.isDuet()) {
                    gr3 = new GR2(0);
                } else {
                    gr3 = new GR3(0);
                }
                if (gr3.LIZ(abstractC41508GQu)) {
                    while (true) {
                        EnumC35470Dw2 enumC35470Dw28 = gr3.LJII;
                        enumC35470Dw2 = EnumC35470Dw2.RTL;
                        if (enumC35470Dw28 != enumC35470Dw2 || !(!this.LIZ.isEmpty()) || !gr3.LIZ((AbstractC41507GQt) this.LIZ.last())) {
                            break;
                        } else {
                            this.LIZ.removeLast();
                        }
                    }
                    if (gr3.LJIIJJI()) {
                        gr3.LJJIIJ(enumC35470Dw2);
                    }
                    LJ(gr3);
                    return;
                }
                throw new GB5("type is DuetChain Block but not accepting! there might be something wrong.", null, 2, null);
            }
        }
        AbstractC41507GQt abstractC41507GQt2 = (AbstractC41507GQt) this.LIZ.LJIILJJIL();
        if (abstractC41507GQt2 != null && !abstractC41507GQt2.LJIIJJI()) {
            AbstractC41507GQt abstractC41507GQt3 = (AbstractC41507GQt) this.LIZ.last();
            if (abstractC41507GQt3.LIZ(abstractC41508GQu)) {
                abstractC41507GQt3.LJIIJJI();
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("last text block(type=");
            LIZ.append(C16880lQ.LJLLJ(abstractC41507GQt3.getClass()));
            LIZ.append(") is uncomplete, but it also didn't accept current text block(type=");
            LIZ.append(C16880lQ.LJLLJ(abstractC41508GQu.getClass()));
            LIZ.append(')');
            throw new GB5(X1D.LIZIZ(LIZ), null, 2, null);
        }
        LJ(abstractC41508GQu);
    }

    public final boolean LJFF(int i, int i2, int i3, CharSequence charSequence) {
        boolean z;
        boolean z2 = false;
        if (i >= i2) {
            return false;
        }
        if (i + 1 <= i3 && i3 < i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZLLL(new C41503GQp(i, i3, charSequence.subSequence(i, i3)), null, false);
            LIZLLL(new C41503GQp(i3, i2, charSequence.subSequence(i3, i2)), null, true);
        } else {
            C41503GQp c41503GQp = new C41503GQp(i, i2, charSequence.subSequence(i, i2));
            if (i2 > i3) {
                z2 = true;
            }
            LIZLLL(c41503GQp, null, z2);
        }
        return true;
    }
}
