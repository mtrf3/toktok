package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.IPhotoModeLogUtil;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.ss.android.ugc.aweme.service.PostModeServiceImpl;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8SG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SG implements IPostModeService {
    public static final C8SG LIZIZ = new C8SG();
    public final /* synthetic */ IPostModeService LIZ = PostModeServiceImpl.LJJIIJ();

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZIZ(EnumC207218Bh type) {
        o.LJIIIZ(type, "type");
        return this.LIZ.LIZIZ(type);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final JHD LIZJ(JHC jhc) {
        return this.LIZ.LIZJ(jhc);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Integer LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC207258Bl LJI(ViewGroup viewGroup) {
        return this.LIZ.LJI(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJII(int i, int i2, Context context, List list) {
        this.LIZ.LJII(i, i2, context, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIIIIZZ(Context context, Aweme aweme, C40517FvF c40517FvF, KL0 priority) {
        o.LJIIIZ(priority, "priority");
        this.LIZ.LJIIIIZZ(context, aweme, c40517FvF, priority);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final IPhotoModeLogUtil LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final String LJIIL(String str) {
        return this.LIZ.LJIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final int LJIILIIL(Context context, Aweme aweme) {
        return this.LIZ.LJIILIIL(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIILL(View view, View view2, Aweme aweme, String str, AqS169S0100000_3 aqS169S0100000_3) {
        this.LIZ.LJIILL(view, view2, aweme, str, aqS169S0100000_3);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIILLIIL(Aweme aweme) {
        return this.LIZ.LJIILLIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJIIZILJ(Object params) {
        o.LJIIIZ(params, "params");
        return this.LIZ.LJIIZILJ(params);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIJ(int i, Context context, List list) {
        this.LIZ.LJIJ(i, context, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIJI(Aweme aweme) {
        return this.LIZ.LJIJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIJJ(String sharedVMKey, C201427vO c201427vO) {
        o.LJIIIZ(sharedVMKey, "sharedVMKey");
        this.LIZ.LJIJJ(sharedVMKey, c201427vO);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIJJLI() {
        return this.LIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIL(Aweme aweme) {
        return this.LIZ.LJIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJ(Activity activity, int i, Object obj, Object obj2) {
        this.LIZ.LJJ(activity, i, obj, obj2);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJI(Aweme aweme) {
        return this.LIZ.LJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIFFI() {
        return this.LIZ.LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final View LJJII(View view) {
        return this.LIZ.LJJII(view);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final float LJJIII() {
        return this.LIZ.LJJIII();
    }
}
