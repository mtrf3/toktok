package X;

import Y.ACallableS35S0110000_3;
import android.content.Context;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8nA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221808nA extends AbstractC221838nD {
    public final Aweme LJLJJL;
    public NormalTrackTimeStamp LJLJJLL;
    public RectF LJLJL;

    @Override // X.AbstractC221838nD
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
        o.LJIIIZ(stickerStruct, "stickerStruct");
        return C223998qh.LIZJ(j, stickerStruct);
    }

    public final void LJIIIIZZ(AddYoursStickerStruct addYoursStickerStruct, boolean z) {
        String str;
        C223778qL c223778qL;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
        if (LJJIFFI == null) {
            return;
        }
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null && (c223778qL = c245649kW.LJIIZILJ) != null) {
            str = c223778qL.LIZ;
        } else {
            str = null;
        }
        C220488l2.LIZIZ.LJIIJ(LJJIFFI, this.LJLJJL, new AddYourRecordParam(addYoursStickerStruct, false, z, str, "add_yours", "click_qa_sticker", String.valueOf(this.LJLJJL.getFollowStatus()), false, true, null, null, null, 3714, null));
    }

    public final boolean LJIIIZ(float f, float f2) {
        String extra = this.LJLJI.getQaStruct().getExtra();
        if (extra == null || extra.length() == 0) {
            return false;
        }
        float optDouble = (float) new JSONObject(extra).optDouble("answer_btn_height");
        float f3 = 0.0f;
        if (!Float.isNaN(optDouble) && optDouble <= 0.0f) {
            return false;
        }
        NormalTrackTimeStamp normalTrackTimeStamp = this.LJLJJLL;
        if (normalTrackTimeStamp != null) {
            float height = (1.0f - optDouble) * normalTrackTimeStamp.getHeight();
            C245649kW c245649kW = this.LJLJJI;
            if (c245649kW != null) {
                f3 = c245649kW.LIZIZ;
            }
            float f4 = f3 * height;
            RectF rectF = this.LJLJL;
            if (rectF != null) {
                RectF rectF2 = new RectF(rectF.left, rectF.top + f4, rectF.right, rectF.bottom);
                RectF rectF3 = this.LJLJL;
                if (rectF3 != null) {
                    float centerX = rectF3.centerX();
                    RectF rectF4 = this.LJLJL;
                    if (rectF4 != null) {
                        float centerY = rectF4.centerY();
                        NormalTrackTimeStamp normalTrackTimeStamp2 = this.LJLJJLL;
                        if (normalTrackTimeStamp2 != null) {
                            double d = -normalTrackTimeStamp2.getRotation();
                            float sin = (float) Math.sin(Math.toRadians(d));
                            float cos = (float) Math.cos(Math.toRadians(d));
                            float f5 = f - centerX;
                            float f6 = f2 - centerY;
                            List LJJIJIIJI = C47261Igj.LJJIJIIJI(Float.valueOf(((f5 * cos) + centerX) - (f6 * sin)), Float.valueOf((f5 * sin) + (f6 * cos) + centerY));
                            if (LJJIJIIJI.isEmpty() || LJJIJIIJI.size() < 2) {
                                return false;
                            }
                            return rectF2.contains(((Number) ListProtector.get(LJJIJIIJI, 0)).floatValue(), ((Number) ListProtector.get(LJJIJIIJI, 1)).floatValue());
                        }
                        o.LJIJI("location");
                        throw null;
                    }
                    o.LJIJI("rectF");
                    throw null;
                }
                o.LJIJI("rectF");
                throw null;
            }
            o.LJIJI("rectF");
            throw null;
        }
        o.LJIJI("location");
        throw null;
    }

    @Override // X.AbstractC221838nD
    public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
        C223618q5 c223618q5;
        o.LJIIIZ(popListener, "popListener");
        AbstractC224038ql abstractC224038ql = this.LJLILLLLZI;
        if ((abstractC224038ql instanceof C223618q5) && (c223618q5 = (C223618q5) abstractC224038ql) != null) {
            if (C234869Jq.LIZ()) {
                QaStruct qaStruct = this.LJLJI.getQaStruct();
                if (qaStruct == null) {
                    return;
                }
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C221758n5(qaStruct, this, f, f2, c223618q5, null), 3);
                return;
            }
            if (!c223618q5.LJJ()) {
                C26045AKb c26045AKb = new C26045AKb(c223618q5.LJLJI);
                c26045AKb.LJIIIIZZ(R.string.pqk);
                c26045AKb.LJIIJ();
            } else if (LJIIIZ(f, f2)) {
                C10K.LIZJ(new ACallableS35S0110000_3(c223618q5, false, 0));
            } else if (e1.LIZ(31744, "one_click_question_sticker_go_to_qa_page", true, false)) {
                c223618q5.LJJIFFI();
            } else {
                popListener.LIZ(c223618q5.LJIL(f, f2));
            }
        }
    }

    @Override // X.AbstractC221838nD, X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        List<NormalTrackTimeStamp> LIZIZ = LIZIZ(j, this.LJLJI);
        if (LIZIZ == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NormalTrackTimeStamp normalTrackTimeStamp : LIZIZ) {
            o.LJI(normalTrackTimeStamp);
            arrayList.add(LIZ(normalTrackTimeStamp));
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            RectF rectF = (RectF) it.next();
            if (ListProtector.get(LIZIZ, i2) != null) {
                Object obj = ListProtector.get(LIZIZ, i2);
                o.LJI(obj);
                if (C79045V0n.LJIIL(f, f2, rectF, ((NormalTrackTimeStamp) obj).getRotation())) {
                    Object obj2 = ListProtector.get(LIZIZ, i2);
                    o.LJI(obj2);
                    this.LJLJJLL = (NormalTrackTimeStamp) obj2;
                    this.LJLJL = rectF;
                    return true;
                }
            }
            i2 = i3;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221808nA(Context context, C223618q5 view, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, Aweme aweme) {
        super(context, view, interactStickerStruct, c245649kW);
        o.LJIIIZ(view, "view");
        this.LJLJJL = aweme;
    }
}
