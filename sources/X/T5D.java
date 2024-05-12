package X;

import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvider;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5D extends T5F {
    public TextView LLFZ;
    public View LLI;
    public TextView LLIFFJFJJ;
    public TextView LLII;
    public TextView LLIIII;
    public TextView LLIIIILZ;
    public View LLIIIJ;
    public T5P LLIIIL;
    public TextView LLIIIZ;
    public T5N LLIIJI;

    @Override // X.T5F
    public int getAttrsResId() {
        return R.layout.vp;
    }

    @Override // X.T5F
    public int getLayoutResId() {
        return R.layout.vv;
    }

    @Override // X.T5F
    public final void LIZIZ() {
        T5G LIZ = ChallengeDetailProvider.LJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(IChalle…eCommerceHeaderDelegate()");
        ((ArrayList) this.LJZI).add(LIZ);
    }

    @Override // X.T5F
    public final void LIZJ() {
        View findViewById = findViewById(R.id.acw);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.avatar_tag)");
        this.LLFZ = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.a9i);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.attrs_container)");
        ViewStub viewStub = (ViewStub) findViewById2;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        o.LJIIIIZZ(inflate, "containerVs.apply { layo… = attrsResId }.inflate()");
        this.LLI = inflate;
        View findViewById3 = inflate.findViewById(R.id.a9j);
        o.LJIIIIZZ(findViewById3, "attrsContainer.findViewById(R.id.attrs_first)");
        this.LLIFFJFJJ = (TextView) findViewById3;
        View view = this.LLI;
        if (view != null) {
            View findViewById4 = view.findViewById(R.id.a9m);
            o.LJIIIIZZ(findViewById4, "attrsContainer.findViewById(R.id.attrs_second)");
            this.LLII = (TextView) findViewById4;
            View view2 = this.LLI;
            if (view2 != null) {
                View findViewById5 = view2.findViewById(R.id.a9n);
                o.LJIIIIZZ(findViewById5, "attrsContainer.findViewById(R.id.attrs_third)");
                this.LLIIII = (TextView) findViewById5;
                View view3 = this.LLI;
                if (view3 != null) {
                    View findViewById6 = view3.findViewById(R.id.a9k);
                    o.LJIIIIZZ(findViewById6, "attrsContainer.findViewById(R.id.attrs_forth)");
                    this.LLIIIILZ = (TextView) findViewById6;
                    View findViewById7 = findViewById(R.id.b21);
                    o.LJIIIIZZ(findViewById7, "findViewById(R.id.button_container)");
                    ViewStub viewStub2 = (ViewStub) findViewById7;
                    viewStub2.setLayoutResource(getButtonResId());
                    View inflate2 = viewStub2.inflate();
                    View findViewById8 = inflate2.findViewById(R.id.bgz);
                    o.LJIIIIZZ(findViewById8, "container.findViewById(R.id.collect_container)");
                    View findViewById9 = inflate2.findViewById(R.id.f0q);
                    o.LJIIIIZZ(findViewById9, "container.findViewById(R.id.iv_collect)");
                    this.LLIIJI = new T5N(findViewById8, (T5P) findViewById9, (TextView) inflate2.findViewById(R.id.m2m), getDetailParam());
                    View findViewById10 = inflate2.findViewById(R.id.ljd);
                    this.LLIIIJ = findViewById10;
                    if (findViewById10 != null) {
                        View findViewById11 = inflate2.findViewById(R.id.fbr);
                        o.LJIIIIZZ(findViewById11, "container.findViewById(R.id.iv_transform)");
                        this.LLIIIL = (T5P) findViewById11;
                        View findViewById12 = inflate2.findViewById(R.id.mpa);
                        o.LJIIIIZZ(findViewById12, "container.findViewById(R.id.tv_transform)");
                        this.LLIIIZ = (TextView) findViewById12;
                    }
                    super.LIZJ();
                    return;
                }
                o.LJIJI("attrsContainer");
                throw null;
            }
            o.LJIJI("attrsContainer");
            throw null;
        }
        o.LJIJI("attrsContainer");
        throw null;
    }

    @Override // X.T5F
    public int getButtonResId() {
        int i = C46500IMu.LIZ[getMHeaderParam().LIZJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return R.layout.vs;
            }
            throw new C162476Zf();
        }
        return R.layout.vr;
    }

    @Override // X.T5F
    public final void LIZ(ChallengeDetail challengeDetail) {
        boolean z;
        if (challengeDetail.challenge == null) {
            return;
        }
        super.LIZ(challengeDetail);
        if (V1B.LJL(getMChallenge().getProfileTagUrl())) {
            TextView textView = this.LLFZ;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.LLFZ;
                if (textView2 != null) {
                    textView2.setText(getMChallenge().getProfileTagUrl());
                } else {
                    o.LJIJI("avatarTag");
                    throw null;
                }
            } else {
                o.LJIJI("avatarTag");
                throw null;
            }
        } else {
            TextView textView3 = this.LLFZ;
            if (textView3 != null) {
                textView3.setVisibility(8);
            } else {
                o.LJIJI("avatarTag");
                throw null;
            }
        }
        List<String> attrs = getMChallenge().getAttrs();
        if (attrs == null || attrs.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = this.LLI;
            if (view != null) {
                view.setVisibility(4);
            } else {
                o.LJIJI("attrsContainer");
                throw null;
            }
        } else {
            TextView textView4 = this.LLIFFJFJJ;
            if (textView4 != null) {
                LJFF(textView4, 0);
                TextView textView5 = this.LLII;
                if (textView5 != null) {
                    LJFF(textView5, 1);
                    TextView textView6 = this.LLIIII;
                    if (textView6 != null) {
                        LJFF(textView6, 2);
                        TextView textView7 = this.LLIIIILZ;
                        if (textView7 != null) {
                            LJFF(textView7, 3);
                            View view2 = this.LLI;
                            if (view2 != null) {
                                view2.setVisibility(0);
                            } else {
                                o.LJIJI("attrsContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("attrsForth");
                            throw null;
                        }
                    } else {
                        o.LJIJI("attrsThird");
                        throw null;
                    }
                } else {
                    o.LJIJI("attrsSecond");
                    throw null;
                }
            } else {
                o.LJIJI("attrsFirst");
                throw null;
            }
        }
        T5N t5n = this.LLIIJI;
        if (t5n != null) {
            t5n.LIZ(getMHeaderParam(), getMChallenge());
            if (this.LLIIIJ == null || !T5E.LIZ(getMChallengeDetail())) {
                return;
            }
            ChallengeTransform transfrom = getMChallenge().getTransfrom();
            if (transfrom.getIconUrlModel() == null) {
                T5P t5p = this.LLIIIL;
                if (t5p != null) {
                    t5p.setVisibility(8);
                } else {
                    o.LJIJI("transformIv");
                    throw null;
                }
            } else {
                T5P t5p2 = this.LLIIIL;
                if (t5p2 != null) {
                    C78765Uvh.LJFF(t5p2, transfrom.getIconUrlModel());
                } else {
                    o.LJIJI("transformIv");
                    throw null;
                }
            }
            TextView textView8 = this.LLIIIZ;
            if (textView8 != null) {
                textView8.setText(transfrom.getText());
                View view3 = this.LLIIIJ;
                o.LJI(view3);
                C16880lQ.LJIIJ(new ACListenerS46S0200000_12(this, transfrom, 43), view3);
                LJ("challenge_transform_button_show");
                return;
            }
            o.LJIJI("transformTv");
            throw null;
        }
        o.LJIJI("collectButtonBlock");
        throw null;
    }

    public final void LJ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("challenge_id", getMChallenge().getCid());
        c188727au.LIZLLL(getMChallenge().getContentType(), "content_type");
        FMX.LJIIL(str, c188727au.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5D(Context context, T5H t5h) {
        super(context, t5h, null);
        a1.LJFF(context, "context");
    }

    public final void LJFF(TextView textView, int i) {
        List<String> attrs = getMChallenge().getAttrs();
        int size = attrs.size() - (4 - i);
        if (size >= 0) {
            textView.setVisibility(0);
            textView.setText((CharSequence) ListProtector.get(attrs, size));
        } else {
            textView.setVisibility(4);
        }
    }
}
