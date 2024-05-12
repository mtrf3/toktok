package X;

import Y.ACallableS110S0100000_7;
import Y.AgS124S0100000_7;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GXY {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final ArrayList<String> LIZJ = new ArrayList<>();
    public static final ArrayList<String> LIZLLL = new ArrayList<>();
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(GAV.LJLIL);

    public static OSZ LIZ() {
        List<AwemeDraft> queryDraftList;
        String str;
        String str2;
        InfoStickerModel LJI;
        List<StickerItemModel> list;
        try {
            queryDraftList = C60903NvH.LJIIJJI().LJJJI().LIZJ().queryDraftList(new GPJ(true, false, null, null, 30));
        } catch (Exception e) {
            H78.LJ(e);
        }
        if (queryDraftList != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (AwemeDraft awemeDraft : queryDraftList) {
                String str3 = awemeDraft.LJI;
                if (str3 != null) {
                    arrayList2.add(str3);
                }
                String str4 = "";
                if (awemeDraft.LJI() != null && (LJI = awemeDraft.LJI()) != null && LJI.stickers != null) {
                    InfoStickerModel LJI2 = awemeDraft.LJI();
                    if (LJI2 != null) {
                        list = LJI2.stickers;
                    } else {
                        list = null;
                    }
                    o.LJI(list);
                    for (StickerItemModel stickerItemModel : list) {
                        if (TextUtils.isEmpty(stickerItemModel.path)) {
                            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("InfoStickers_resdir_null:");
                            String str5 = stickerItemModel.stickerId;
                            if (str5 == null) {
                                str5 = "";
                            }
                            LIZ2.append(str5);
                            LJJIIZI.LJIIZILJ(X1D.LIZIZ(LIZ2));
                        } else {
                            String str6 = stickerItemModel.path;
                            o.LJIIIIZZ(str6, "item.path");
                            String str7 = stickerItemModel.path;
                            o.LJIIIIZZ(str7, "item.path");
                            String separator = File.separator;
                            o.LJIIIIZZ(separator, "separator");
                            String substring = str6.substring(s.LJJLIIJ(str7, separator, 6) + 1);
                            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                            arrayList.add(substring);
                        }
                    }
                }
                for (EffectPointModel effectPointModel : awemeDraft.LJ()) {
                    if (TextUtils.isEmpty(effectPointModel.getResDir())) {
                        InterfaceC170656mr LJJIIZI2 = C60903NvH.LJIIJJI().LJJIIZI();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("EffectListModel_resdir_null:");
                        if (effectPointModel.getKey() == null) {
                            str2 = "";
                        } else {
                            str2 = effectPointModel.getKey();
                        }
                        LIZ3.append(str2);
                        LJJIIZI2.LJIIZILJ(X1D.LIZIZ(LIZ3));
                    } else {
                        String resDir = effectPointModel.getResDir();
                        o.LJIIIIZZ(resDir, "item.resDir");
                        String resDir2 = effectPointModel.getResDir();
                        o.LJIIIIZZ(resDir2, "item.resDir");
                        String separator2 = File.separator;
                        o.LJIIIIZZ(separator2, "separator");
                        String substring2 = resDir.substring(s.LJJLIIJ(resDir2, separator2, 6) + 1);
                        o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                        arrayList.add(substring2);
                    }
                }
                if (awemeDraft.LIZLLL() != null) {
                    DraftVEAudioEffectParam LIZLLL2 = awemeDraft.LIZLLL();
                    if (LIZLLL2 != null) {
                        str = LIZLLL2.effectPath;
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        InterfaceC170656mr LJJIIZI3 = C60903NvH.LJIIJJI().LJJIIZI();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("EffectListModel_resdir_null:");
                        if (str != null) {
                            str4 = str;
                        }
                        LIZ4.append(str4);
                        LJJIIZI3.LJIIZILJ(X1D.LIZIZ(LIZ4));
                    } else if (str != null) {
                        String separator3 = File.separator;
                        o.LJIIIIZZ(separator3, "separator");
                        String substring3 = str.substring(s.LJJLIIJ(str, separator3, 6) + 1);
                        o.LJIIIIZZ(substring3, "this as java.lang.String).substring(startIndex)");
                        arrayList.add(substring3);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            return new OSZ(ORZ.LJLL(arrayList), ORZ.LJLL(arrayList2));
        }
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        return new OSZ(c61878OQg, c61878OQg);
    }

    public static void LIZIZ() {
        C41671GXb c41671GXb = C41671GXb.LJLIL;
        GXZ gxz = GXZ.LJLIL;
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(c41671GXb, 513);
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        if (C43941HMj.LIZIZ() || (e1.LIZ(31744, "studio_ep_draft_provider_opt", true, true) && o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL()))) {
            C10K.LIZIZ(new ACallableS110S0100000_7(gxz, 36), (Executor) LJ.getValue(), null).LJ(new AgS124S0100000_7(aqS157S0100000_7, 25), C10K.LJIIIIZZ, null);
        } else {
            gxz.invoke();
            aqS157S0100000_7.invoke();
        }
    }
}
