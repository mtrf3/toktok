package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import defpackage.i0;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1$textStickerJob$1", f = "ChangAvatarActionStage.kt", l = {204}, m = "invokeSuspend")
/* renamed from: X.5aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137305aA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C137415aL LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137305aA(C137415aL c137415aL, InterfaceC67352kd<? super C137305aA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c137415aL;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137305aA(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        float LIZ;
        Integer num;
        float LIZIZ;
        float LIZ2;
        Integer num2;
        int i;
        int i2;
        int ceil;
        String LJJIL;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i3 = this.LJLIL;
        if (i3 != 0) {
            if (i3 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C137415aL c137415aL = this.LJLILLLLZI;
            this.LJLIL = 1;
            c137415aL.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            CreativeModel creativeModel = c137415aL.LIZIZ.creativeModel;
            o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
            boolean z = creativeModel.changeAvatarModel.isFromAiVatar;
            TextStickerData[] textStickerDataArr = new TextStickerData[2];
            String str = c137415aL.LIZJ;
            float f = 2;
            float LIZJ = C170576mj.LIZJ(c137415aL.LIZ) / f;
            if (z) {
                LIZ = ((C170576mj.LIZJ(c137415aL.LIZ) / f) + (C170576mj.LIZIZ(c137415aL.LIZ) / f)) - C170576mj.LIZ(c137415aL.LIZ, 58.0f);
            } else {
                LIZ = C170576mj.LIZ(c137415aL.LIZ, 160.0f) + (C170576mj.LIZIZ(c137415aL.LIZ) / f);
            }
            if (z) {
                num = 20;
            } else {
                num = null;
            }
            textStickerDataArr[0] = c137415aL.LIZ(str, LIZJ, LIZ, 1.0f, num);
            String titleString = c137415aL.LJ;
            o.LJIIIIZZ(titleString, "titleString");
            float LIZJ2 = C170576mj.LIZJ(c137415aL.LIZ) / f;
            if (z) {
                LIZIZ = (C170576mj.LIZIZ(c137415aL.LIZ) / f) - (C170576mj.LIZJ(c137415aL.LIZ) / f);
                LIZ2 = C170576mj.LIZ(c137415aL.LIZ, 28.0f);
            } else {
                LIZIZ = C170576mj.LIZIZ(c137415aL.LIZ) / f;
                LIZ2 = C170576mj.LIZ(c137415aL.LIZ, 220.0f);
            }
            float f2 = LIZIZ - LIZ2;
            if (z) {
                num2 = 24;
            } else {
                num2 = null;
            }
            textStickerDataArr[1] = c137415aL.LIZ(titleString, LIZJ2, f2, 1.0f, num2);
            List<TextStickerData> LJJIJIL = C47261Igj.LJJIJIL(textStickerDataArr);
            if (!z) {
                String dataString = c137415aL.LIZLLL;
                o.LJIIIIZZ(dataString, "dataString");
                LJJIJIL.add(c137415aL.LIZ(dataString, C170576mj.LIZJ(c137415aL.LIZ) / f, C170576mj.LIZIZ(c137415aL.LIZ) - C170576mj.LIZ(c137415aL.LIZ, 180.0f), 0.5f, null));
            }
            if (C141525gy.LIZ(c137415aL.LIZIZ.videoWidth(), c137415aL.LIZIZ.videoHeight())) {
                i2 = c137415aL.LIZIZ.videoWidth();
                ceil = c137415aL.LIZIZ.videoHeight();
            } else {
                int[] LIZLLL = C44739Hh9.LIZLLL();
                if (LIZLLL != null) {
                    i = LIZLLL[0];
                } else {
                    i = 720;
                }
                int videoWidth = c137415aL.LIZIZ.videoWidth();
                if (videoWidth <= i) {
                    i = videoWidth;
                }
                i2 = ((i + 16) - 1) & (-16);
                ceil = (int) (Math.ceil(i2 / 9.0d) * 16);
            }
            for (TextStickerData textStickerData : LJJIJIL) {
                textStickerData.setCanvasHeight(ceil);
                textStickerData.setCanvasWidth(i2);
            }
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIL, 10));
            int i4 = 0;
            for (Object obj2 : LJJIJIL) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    StickerItemModel LJFF = C151525x6.LJFF((TextStickerData) obj2, i4);
                    LJJIL = C5YW.LIZIZ().LJJIL(c137415aL.LIZIZ, "");
                    String separator = File.separator;
                    o.LJIIIIZZ(separator, "separator");
                    if (!ujb.o.LJJJJ(LJJIL, separator, false)) {
                        LJJIL = i0.LJFF(LJJIL, separator);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LJJIL);
                    LIZ3.append("text_sticker_");
                    LIZ3.append(i4);
                    LIZ3.append(".png");
                    LJFF.path = X1D.LIZIZ(LIZ3);
                    LJFF.endTime = (int) C78929UyL.LIZLLL(c137415aL.LIZIZ.getPreviewInfo());
                    arrayList.add(LJFF);
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c137415aL.LIZIZ.infoStickerModel.addSticker((StickerItemModel) it.next());
            }
            ((ExecutorService) c137415aL.LJI.getValue()).execute((RunnableC137475aR) c137415aL.LJFF.getValue());
            Object obj3 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(obj3);
            c84654XKg.resumeWith(obj3);
            Object LIZ4 = c84654XKg.LIZ();
            if (LIZ4 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                obj3 = LIZ4;
            }
            if (obj3 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
