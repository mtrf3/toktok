package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Arg3;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Body;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Command;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Interface;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.VxW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81426VxW extends TAT {
    public final /* synthetic */ Effect LJLJJI;
    public final /* synthetic */ C81427VxX LJLJJL;

    @Override // X.TAT
    public final void LIZ(View v) {
        int i;
        long j;
        o.LJIIIZ(v, "v");
        Effect effect = this.LJLJJI;
        if (effect instanceof ProTemplateEffect) {
            Context context = v.getContext();
            o.LJIIIIZZ(context, "v.context");
            C81427VxX c81427VxX = this.LJLJJL;
            C74284TDk.LIZ(context, c81427VxX.LJLJI, this.LJLJJI, c81427VxX.LJLILLLLZI);
            return;
        }
        if (effect instanceof DraftEffect) {
            Context context2 = v.getContext();
            o.LJIIIIZZ(context2, "v.context");
            C74284TDk.LIZIZ(context2, ((DraftEffect) this.LJLJJI).getDraft(), this.LJLJJL.LJLILLLLZI);
            C78897Uxp.LJJJ("click_edit_draft_advanced_mobile_effect", this.LJLJJL.LJLJLJ);
            return;
        }
        if (effect != null && DiyPropParser.LJIIIIZZ(effect)) {
            String str = null;
            C79451VGd c79451VGd = new C79451VGd((Integer) 41, (Long) 41L, new Arg3(Interface.NATIVE_EDIT_BUTTON, new Body(Command.BTN_CLICKED, null, 2, null)), 4);
            C81427VxX c81427VxX2 = this.LJLJJL;
            c81427VxX2.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MEEditStickerHandler send effect msg: ");
            LIZ.append(c79451VGd);
            H78.LJI(X1D.LIZIZ(LIZ));
            VERecorder LJ = c81427VxX2.LJLJJI.rX().LJ();
            Integer num = c79451VGd.LIZ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Long l = c79451VGd.LIZIZ;
            long j2 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Long l2 = c79451VGd.LIZJ;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            Arg3 arg3 = c79451VGd.LIZLLL;
            if (arg3 != null) {
                str = C78880UxY.LJLILLLLZI(arg3);
                o.LJIIIIZZ(str, "toJson(this)");
            }
            LJ.LIZIZ.sendEffectMsg(i, j, j2, str);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" MEEditStickerHandler click not supported: ");
        LIZ2.append(this.LJLJJI);
        H78.LIZJ(X1D.LIZIZ(LIZ2));
    }

    public C81426VxW(Effect effect, C81427VxX c81427VxX) {
        this.LJLJJI = effect;
        this.LJLJJL = c81427VxX;
    }
}
