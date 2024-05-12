package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Lwa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55888Lwa implements INoticeService {
    public static final C55888Lwa LIZIZ = new C55888Lwa();
    public final /* synthetic */ INoticeService LIZ = NoticeServiceImpl.LJJJJJ();

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LIZ(Context context, GuideOutPushParam guideOutPushParam) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZ(context, guideOutPushParam);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final MWC LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends CommonPageFragment> Class<? extends T> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Class<?> LIZLLL(Context context, GuideOutPushParam guideOutPushParam, MS3 ms3) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZLLL(context, guideOutPushParam, ms3);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJ(WeakHandler weakHandler, String str) {
        this.LIZ.LJ(weakHandler, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Intent LJFF(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        return this.LIZ.LJFF(ctx);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJI(InterfaceC55887LwZ callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZ.LJI(callback);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJII(String str, String str2) {
        return this.LIZ.LJII(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIIIIZZ(int i) {
        this.LIZ.LJIIIIZZ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIIIZ(int i) {
        this.LIZ.LJIIIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIIJ() {
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends AmeBaseFragment> Class<? extends T> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIILIIL() {
        this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC55337Lnh LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIILL(WeakHandler weakHandler, String str) {
        this.LIZ.LJIILL(weakHandler, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIILLIIL(Context context) {
        return this.LIZ.LJIILLIIL(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIJ(InterfaceC55887LwZ callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZ.LJIJ(callback);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final View.OnClickListener LJIJI(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        return this.LIZ.LJIJI(ctx);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIJJ() {
        this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIJJLI(BaseResponse baseResponse) {
        return this.LIZ.LJIJJLI(baseResponse);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final LR8 LJIL(ActivityC45651qj activityC45651qj) {
        return this.LIZ.LJIL(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJJ(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJI(boolean z) {
        return this.LIZ.LJJI(z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIFFI(Context context) {
        this.LIZ.LJJIFFI(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJII(C54251LQx c54251LQx) {
        this.LIZ.LJJII(c54251LQx);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final SIT LJJIII(SI5 si5) {
        return this.LIZ.LJJIII(si5);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIIJ() {
        this.LIZ.LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC54240LQm LJJIIJZLJL() {
        return this.LIZ.LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIIZ(BaseResponse baseResponse) {
        return this.LIZ.LJJIIZ(baseResponse);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final AbstractC53764L8e LJJIIZI() {
        return this.LIZ.LJJIIZI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJJIJ() {
        return this.LIZ.LJJIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Intent LJJIJIIJI(Context ctx, String str) {
        o.LJIIIZ(ctx, "ctx");
        return this.LIZ.LJJIJIIJI(ctx, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIJIIJIL() {
        this.LIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final EFM LJJIJIL() {
        return this.LIZ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIJL(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJJIJL(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIJLIJ(Context context, User user, boolean z) {
        return this.LIZ.LJJIJLIJ(context, user, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Object LJJIL() {
        return this.LIZ.LJJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIZ(boolean z) {
        this.LIZ.LJJIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJ() {
        this.LIZ.LJJJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJI() {
        this.LIZ.LJJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJIL(NoticeList noticeList) {
        this.LIZ.LJJJIL(noticeList);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJ() {
        this.LIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJI(Context context, GuideOutPushParam guideOutPushParam) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJJJJI(context, guideOutPushParam);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJJIZL() {
        return this.LIZ.LJJJJIZL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void initLegoInflate() {
        this.LIZ.initLegoInflate();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void notifyLocaleChange(Locale locale) {
        this.LIZ.notifyLocaleChange(locale);
    }
}
