package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168796jr {
    public static final List<String> LIZ;

    static {
        String absolutePath = new File(H8J.LIZ(), "filter").getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "File(creativeToolsFileRo…), \"filter\").absolutePath");
        String absolutePath2 = new File(H8J.LIZ(), "filters").getAbsolutePath();
        o.LJIIIIZZ(absolutePath2, "File(creativeToolsFileRo…, \"filters\").absolutePath");
        String absolutePath3 = new File(H8J.LIZ(), "font").getAbsolutePath();
        o.LJIIIIZZ(absolutePath3, "File(creativeToolsFileRo…r(), \"font\").absolutePath");
        String absolutePath4 = new File(H8J.LIZ(), "effect").getAbsolutePath();
        o.LJIIIIZZ(absolutePath4, "File(creativeToolsFileRo…), \"effect\").absolutePath");
        String absolutePath5 = new File(H8J.LIZ(), "music").getAbsolutePath();
        o.LJIIIIZZ(absolutePath5, "File(creativeToolsFileRo…(), \"music\").absolutePath");
        String absolutePath6 = new File(H8J.LIZ(), "effectmodel").getAbsolutePath();
        o.LJIIIIZZ(absolutePath6, "File(creativeToolsFileRo…ffectmodel\").absolutePath");
        String absolutePath7 = new File(H8J.LIZ(), "duet").getAbsolutePath();
        o.LJIIIIZZ(absolutePath7, "File(creativeToolsFileRo…r(), \"duet\").absolutePath");
        String absolutePath8 = new File(H8J.LIZ(), "audio-effect").getAbsolutePath();
        o.LJIIIIZZ(absolutePath8, "File(creativeToolsFileRo…dio-effect\").absolutePath");
        StringBuilder LIZ2 = X1D.LIZ();
        String absolutePath9 = H8J.LIZ().getAbsolutePath();
        o.LJIIIIZZ(absolutePath9, "creativeToolsFileRootDir().absolutePath");
        LIZ2.append(C78966Uyw.LJIJJLI(absolutePath9));
        LIZ2.append("mvtheme");
        String str = File.separator;
        LIZ = C47261Igj.LJII(C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILIIL(), C60903NvH.LJIIJJI().LJJIJL().getPathService().getCacheRoot(), C60903NvH.LJIIJJI().LJJIJL().getPathService().getPersistentRoot(), C78966Uyw.LJIJJLI(absolutePath), C78966Uyw.LJIJJLI(absolutePath2), C78966Uyw.LJIJJLI(absolutePath3), C78966Uyw.LJIJJLI(absolutePath4), C78966Uyw.LJIJJLI(absolutePath5), C78966Uyw.LJIJJLI(absolutePath6), C78966Uyw.LJIJJLI(absolutePath7), C78966Uyw.LJIJJLI(absolutePath8), C025908h.LIZIZ(LIZ2, str, "mvres", str, LIZ2));
    }

    public static final List<DraftFileRestoreResult> LIZJ(AwemeDraft draft, CreativeInfo dstCreativeInfo) {
        C43068GvI c43068GvI;
        boolean z;
        Object obj;
        boolean z2;
        Integer num;
        Object obj2;
        DraftFileRestoreResult draftFileRestoreResult;
        boolean z3;
        String str;
        Object first;
        String str2;
        List<StickerItemModel> list;
        String str3;
        boolean z4;
        TextStickerData textStickerData;
        boolean z5;
        String str4;
        o.LJIIIZ(draft, "draft");
        o.LJIIIZ(dstCreativeInfo, "dstCreativeInfo");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = draft.LJJJJI.multiEditVideoData;
        ArrayList arrayList = null;
        if (multiEditVideoStatusRecordData != null) {
            c43068GvI = C78999UzT.LJIJI(multiEditVideoStatusRecordData);
        } else {
            c43068GvI = null;
        }
        if (c43068GvI == null || c43068GvI.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            draftFileRestoreResult = new DraftFileRestoreResult(4, 1000, null, false, null, 28, null);
        } else {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(c43068GvI, 10));
            Iterator<T> it = c43068GvI.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                String parent = new File(str5).getParent();
                if (parent != null) {
                    str = C78966Uyw.LJIJJLI(parent);
                } else {
                    str = null;
                }
                LIZ2.append(str);
                LIZ2.append("data.txt");
                if (!C78966Uyw.LJJIJIL(X1D.LIZIZ(LIZ2))) {
                    first = new DraftFileRestoreException(0, null, 3, null);
                } else {
                    first = C78857UxB.LJJJJJL(str5, draft.LIZIZ(), dstCreativeInfo, C169196kV.LIZ).getFirst();
                }
                arrayList2.add(first);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    DraftFileRestoreException draftFileRestoreException = (DraftFileRestoreException) obj;
                    if (!draftFileRestoreException.isSuc() && C78847Ux1.LJJJ(draftFileRestoreException)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                num = Integer.valueOf(R.string.eys);
            } else {
                num = null;
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    if (!((DraftFileRestoreException) obj2).isSuc()) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            DraftFileRestoreException draftFileRestoreException2 = (DraftFileRestoreException) obj2;
            if (draftFileRestoreException2 == null) {
                draftFileRestoreException2 = new DraftFileRestoreException(0, null, 3, null);
            }
            draftFileRestoreResult = new DraftFileRestoreResult(4, 1000, num, true, draftFileRestoreException2);
        }
        String str6 = draft.LJI;
        DuetExtraInfo duetExtraInfo = draft.LJJJJI.duetExtraInfo;
        if (duetExtraInfo != null) {
            str2 = duetExtraInfo.getDuetAudioPath();
        } else {
            str2 = null;
        }
        boolean LJ = o.LJ(str6, str2);
        List<DraftFileRestoreResult> LIZ3 = LIZ(draft, dstCreativeInfo, C42083GfP.LIZ(AVDraftExtras.class, InterfaceC43620HAa.class), draft.LJJJJI);
        List<DraftFileRestoreResult> LIZ4 = LIZ(draft, dstCreativeInfo, C42083GfP.LIZ(CreativeModel.class, InterfaceC43620HAa.class), draft.LIZ);
        if (LJ) {
            DuetExtraInfo duetExtraInfo2 = draft.LJJJJI.duetExtraInfo;
            if (duetExtraInfo2 != null) {
                str4 = duetExtraInfo2.getDuetAudioPath();
            } else {
                str4 = null;
            }
            draft.LJI = str4;
        }
        ArrayList arrayList3 = new ArrayList();
        if (!draft.LIZ.stickerModel.textStickerModels.isEmpty()) {
            List<TextStickerModel> list2 = draft.LIZ.stickerModel.textStickerModels;
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(list2, 10));
            for (TextStickerModel textStickerModel : list2) {
                arrayList4.add(new OSZ(textStickerModel, C137045Zk.LIZIZ(textStickerModel)));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                String audioTrackFilePath = ((TextStickerData) ((OSZ) next).getSecond()).getAudioTrackFilePath();
                if (audioTrackFilePath == null || audioTrackFilePath.length() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    arrayList5.add(next);
                }
            }
            if (true ^ arrayList5.isEmpty()) {
                arrayList = arrayList5;
            }
            C42236Ghs LIZ5 = C42083GfP.LIZ(TextStickerData.class, InterfaceC43620HAa.class);
            if (arrayList != null) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    arrayList3.addAll(LIZ(draft, dstCreativeInfo, LIZ5, ((OSZ) it5.next()).getSecond()));
                }
            }
        } else {
            InfoStickerModel infoStickerModel = draft.LJJJJI.infoStickerModel;
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                ArrayList arrayList6 = new ArrayList();
                for (StickerItemModel stickerItemModel : list) {
                    if (stickerItemModel.isTextSticker()) {
                        arrayList6.add(stickerItemModel);
                    }
                }
                ArrayList arrayList7 = new ArrayList(C32I.LJJL(arrayList6, 10));
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    StickerItemModel stickerItemModel2 = (StickerItemModel) it6.next();
                    try {
                        textStickerData = (TextStickerData) C60903NvH.LJIIJJI().LIZ().LJI(stickerItemModel2.extra, TextStickerData.class);
                    } catch (Throwable unused) {
                        textStickerData = null;
                    }
                    arrayList7.add(new OSZ(stickerItemModel2, textStickerData));
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it7 = arrayList7.iterator();
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    TextStickerData textStickerData2 = (TextStickerData) ((OSZ) next2).getSecond();
                    if (textStickerData2 != null) {
                        str3 = textStickerData2.getAudioTrackFilePath();
                    } else {
                        str3 = null;
                    }
                    if (str3 == null || str3.length() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        arrayList8.add(next2);
                    }
                }
                if (true ^ arrayList8.isEmpty()) {
                    arrayList = arrayList8;
                }
                if (arrayList != null) {
                    C42236Ghs LIZ6 = C42083GfP.LIZ(TextStickerData.class, InterfaceC43620HAa.class);
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        OSZ osz = (OSZ) it8.next();
                        Object second = osz.getSecond();
                        if (second != null) {
                            arrayList3.addAll(LIZ(draft, dstCreativeInfo, LIZ6, second));
                            ((StickerItemModel) osz.getFirst()).extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), second);
                        }
                    }
                }
            }
        }
        C78841Uwv.LJJIIZ("", new AqS149S0200000_2(draft, dstCreativeInfo, 87));
        List<DraftFileRestoreResult> LLIIIZ = ORZ.LLIIIZ(arrayList3, ORZ.LLIIIZ(LIZ4, ORZ.LLIIIZ(LIZ3, ORZ.LLIIJI(draftFileRestoreResult, new ArrayList()))));
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("DraftCreativeRestoreHandler ; restore done ... ; results : ");
        LIZ7.append(LLIIIZ);
        C5Z2.LIZ(X1D.LIZIZ(LIZ7));
        return LLIIIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.5Ht] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.draft.model.AwemeDraft r9, final com.ss.android.ugc.aweme.creative.CreativeInfo r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            boolean r0 = r11 instanceof X.C5UR
            if (r0 == 0) goto L88
            r7 = r11
            X.5UR r7 = (X.C5UR) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L88
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r8 = 1
            if (r0 == 0) goto L33
            if (r0 != r8) goto L8e
            com.bytedance.ies.nle.editor_jni.NLEEditor r3 = r7.LJLILLLLZI
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r9 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L24:
            r3.LIZIZ()
            r3.LIZJ()
            java.lang.String r0 = r3.LJIIIIZZ()
            r9.LJIIJ = r0
        L30:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L33:
            X.C141335gf.LIZJ(r1)
            X.Ol8 r0 = X.C52M.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L47
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L47:
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r9.LJJJJI
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r5 = r0.audioRecorderParam
            if (r5 != 0) goto L50
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L50:
            java.lang.String r0 = r5.getAudioUrl()
            int r0 = r0.length()
            if (r0 <= 0) goto L30
            java.util.List r0 = r5.getMultiTrackAudio()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L30
            X.5Ht r4 = new X.5Ht
            r4.<init>(r10)
            com.bytedance.ies.nle.editor_jni.NLEEditor r3 = new com.bytedance.ies.nle.editor_jni.NLEEditor
            r3.<init>()
            java.lang.String r0 = r9.LJIIJ
            r3.LJI(r0)
            X.XIA r2 = X.C78613UtF.LIZJ
            X.5Cx r1 = new X.5Cx
            r0 = 0
            r1.<init>(r3, r5, r4, r0)
            r7.LJLIL = r9
            r7.LJLILLLLZI = r3
            r7.LJLJJI = r8
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r7)
            if (r0 != r6) goto L24
            return r6
        L88:
            X.5UR r7 = new X.5UR
            r7.<init>(r11)
            goto L12
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168796jr.LIZLLL(com.ss.android.ugc.aweme.draft.model.AwemeDraft, com.ss.android.ugc.aweme.creative.CreativeInfo, X.2kd):java.lang.Object");
    }

    public static final <HandleClass> List<DraftFileRestoreResult> LIZ(AwemeDraft awemeDraft, CreativeInfo creativeInfo, C42236Ghs<HandleClass, InterfaceC43620HAa> c42236Ghs, HandleClass handleclass) {
        CreativeInfo LIZIZ = awemeDraft.LIZIZ();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            c42236Ghs.LIZIZ(handleclass, new GPX(new HashMap(), awemeDraft, LIZIZ, creativeInfo, arrayList, arrayList2));
        } catch (C168806js unused) {
        }
        return ORZ.LLIIIZ(arrayList2, ORZ.LLIIIZ(arrayList, new ArrayList()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(java.util.Map<String, String> map, AwemeDraft awemeDraft, CreativeInfo creativeInfo, CreativeInfo creativeInfo2, List<DraftFileRestoreResult> list, List<DraftFileRestoreResult> list2, String originPath, InterfaceC43620HAa interfaceC43620HAa, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        boolean z;
        Object obj = map.get(originPath);
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        Object obj2 = obj;
        if (!(!z) || obj == null) {
            OSZ LJJJJJL = C78857UxB.LJJJJJL(originPath, creativeInfo, creativeInfo2, C169196kV.LIZ);
            boolean LJJJ = C78847Ux1.LJJJ((DraftFileRestoreException) LJJJJJL.getFirst());
            boolean blockCreative = interfaceC43620HAa.blockCreative();
            int i = R.string.eys;
            if (blockCreative && !((DraftFileRestoreException) LJJJJJL.getFirst()).isSuc()) {
                if (!LJJJ) {
                    i = R.string.him;
                }
                list.add(new DraftFileRestoreResult(4, 1000, Integer.valueOf(i), true, (DraftFileRestoreException) LJJJJJL.getFirst()));
                final DraftFileRestoreException draftFileRestoreException = (DraftFileRestoreException) LJJJJJL.getFirst();
                throw new C168816jt(draftFileRestoreException) { // from class: X.6js
                    public final DraftFileRestoreException LJLIL;

                    public final DraftFileRestoreException getRestoreException() {
                        return this.LJLIL;
                    }

                    {
                        o.LJIIIZ(draftFileRestoreException, "restoreException");
                        this.LJLIL = draftFileRestoreException;
                    }
                };
            }
            if (!interfaceC43620HAa.blockCreative() && !((DraftFileRestoreException) LJJJJJL.getFirst()).isSuc()) {
                if (LJJJ) {
                    num = Integer.valueOf(R.string.eys);
                }
                list2.add(new DraftFileRestoreResult(4, 1000, num, LJJJ, (DraftFileRestoreException) LJJJJJL.getFirst()));
            } else {
                map.put(originPath, LJJJJJL.getSecond());
            }
            Object second = LJJJJJL.getSecond();
            obj2 = second;
            if (second == null) {
                return;
            }
        }
        if (!o.LJ(obj2, originPath)) {
            interfaceC88472Yns.invoke(obj2);
            awemeDraft.getClass();
            o.LJIIIZ(originPath, "originPath");
            awemeDraft.LJIJI.put(originPath, obj2);
        }
    }
}
