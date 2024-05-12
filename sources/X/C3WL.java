package X;

import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3WL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WL extends ConstraintLayout implements C3WY {
    public final /* synthetic */ C3WQ LJLIL;
    public boolean LJLILLLLZI;
    public InterfaceC84293Sn LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3WL(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3WL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJJZ() {
        this.LJLIL.LIZ();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LLJILLL(c3wr);
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LJJLJLI(int i) {
        if (this.LJLILLLLZI || i == 8) {
            return;
        }
        this.LJLILLLLZI = true;
        View.inflate(getContext(), R.layout.b7a, this);
        setBackgroundColor(C97343ru.LIZLLL(R.attr.cl));
    }

    public final void LJJZZI(C63120Opw c63120Opw) {
        String string;
        String l;
        if (c63120Opw == null) {
            return;
        }
        LJJLJLI(0);
        if (c63120Opw.getCoreInfo() == null) {
            View tv_details = _$_findCachedViewById(R.id.m50);
            o.LJIIIIZZ(tv_details, "tv_details");
            tv_details.setVisibility(8);
            View tv_title = _$_findCachedViewById(R.id.mo6);
            o.LJIIIIZZ(tv_title, "tv_title");
            tv_title.setVisibility(8);
        } else {
            String str = null;
            String str2 = "";
            if (c63120Opw.isDissolved()) {
                View tv_details2 = _$_findCachedViewById(R.id.m50);
                o.LJIIIIZZ(tv_details2, "tv_details");
                tv_details2.setVisibility(0);
                View tv_title2 = _$_findCachedViewById(R.id.mo6);
                o.LJIIIIZZ(tv_title2, "tv_title");
                tv_title2.setVisibility(8);
                C81143Gk c81143Gk = C81143Gk.LIZ;
                EnumC81073Gd enumC81073Gd = EnumC81073Gd.AT_MOST_DB;
                String conversationId = c63120Opw.getConversationId();
                C63088OpQ coreInfo = c63120Opw.getCoreInfo();
                if (coreInfo != null && (l = Long.valueOf(coreInfo.getOwner()).toString()) != null) {
                    str2 = l;
                }
                C63088OpQ coreInfo2 = c63120Opw.getCoreInfo();
                if (coreInfo2 != null) {
                    str = coreInfo2.getSecOwner();
                }
                C81183Go c81183Go = new C81183Go(conversationId, str2, str);
                InterfaceC81233Gt interfaceC81233Gt = new InterfaceC81233Gt() { // from class: X.3WS
                    @Override // X.InterfaceC81233Gt
                    public final void LIZ(final C81243Gu imMember, EnumC81193Gp reason) {
                        o.LJIIIZ(imMember, "imMember");
                        o.LJIIIZ(reason, "reason");
                        if (C81203Gq.LIZ[reason.ordinal()] == 1) {
                            String displayName = imMember.getDisplayName();
                            if (displayName == null) {
                                displayName = "";
                            }
                            String string2 = C3WL.this.getContext().getString(R.string.gvf, displayName);
                            o.LJIIIIZZ(string2, "context.getString(R.stri…lete_message, nameString)");
                            SpannableString spannableString = new SpannableString(string2);
                            int LJJLIIIJL = s.LJJLIIIJL(string2, displayName, 0, false, 6);
                            Context context = C3WL.this.getContext();
                            o.LJIIIIZZ(context, "context");
                            final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
                            spannableString.setSpan(new ClickableSpan() { // from class: X.3i6
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View widget) {
                                    o.LJIIIZ(widget, "widget");
                                    C3E5.LIZLLL(C81243Gu.this.getUid());
                                    C96093pt.LIZ(C81243Gu.this.getUid());
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint ds) {
                                    o.LJIIIZ(ds, "ds");
                                    ds.setColor(LJIIIIZZ);
                                    ds.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                                    ds.setUnderlineText(false);
                                }
                            }, LJJLIIIJL, displayName.length() + LJJLIIIJL, 34);
                            TextView textView = (TextView) C3WL.this._$_findCachedViewById(R.id.m50);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView.setHighlightColor(0);
                            textView.setText(spannableString);
                        }
                    }
                };
                c81143Gk.getClass();
                C81143Gk.LIZ(enumC81073Gd, c81183Go, interfaceC81233Gt);
            } else if (!c63120Opw.isMember()) {
                View tv_details3 = _$_findCachedViewById(R.id.m50);
                o.LJIIIIZZ(tv_details3, "tv_details");
                tv_details3.setVisibility(0);
                View tv_title3 = _$_findCachedViewById(R.id.mo6);
                o.LJIIIIZZ(tv_title3, "tv_title");
                tv_title3.setVisibility(8);
                ((TextView) _$_findCachedViewById(R.id.m50)).setText(getContext().getString(R.string.gvg));
            } else {
                C84283Sm.LIZ.getClass();
                if (C84283Sm.LJFF(c63120Opw)) {
                    InterfaceC84293Sn LIZJ = C84283Sm.LIZJ(c63120Opw);
                    if (o.LJ(this.LJLJI, LIZJ)) {
                        return;
                    }
                    this.LJLJI = LIZJ;
                    C84323Sq c84323Sq = C84323Sq.LIZ;
                    if (o.LJ(LIZJ, c84323Sq) || o.LJ(LIZJ, C84303So.LIZ) || o.LJ(LIZJ, C84313Sp.LIZ)) {
                        string = "";
                    } else if (LIZJ instanceof C3O4) {
                        Context context = getContext();
                        if (context != null) {
                            string = context.getString(R.string.gu5);
                        }
                        string = null;
                    } else if (o.LJ(LIZJ, C3NB.LIZ)) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            string = context2.getString(R.string.gu4);
                        }
                        string = null;
                    } else {
                        throw new C162476Zf();
                    }
                    InterfaceC84293Sn interfaceC84293Sn = this.LJLJI;
                    if (o.LJ(interfaceC84293Sn, c84323Sq) || o.LJ(interfaceC84293Sn, C84303So.LIZ) || o.LJ(interfaceC84293Sn, C84313Sp.LIZ)) {
                        str = "";
                    } else if (interfaceC84293Sn instanceof C3O4) {
                        Context context3 = getContext();
                        if (context3 != null) {
                            str = context3.getString(R.string.gul);
                        }
                    } else if (o.LJ(interfaceC84293Sn, C3NB.LIZ)) {
                        Context context4 = getContext();
                        if (context4 != null) {
                            str = context4.getString(R.string.gu3);
                        }
                    } else {
                        throw new C162476Zf();
                    }
                    TextView handleGroupBanned$lambda$3 = (TextView) _$_findCachedViewById(R.id.mo6);
                    o.LJIIIIZZ(handleGroupBanned$lambda$3, "handleGroupBanned$lambda$3");
                    handleGroupBanned$lambda$3.setVisibility(0);
                    handleGroupBanned$lambda$3.setText(string);
                    TextView handleGroupBanned$lambda$4 = (TextView) _$_findCachedViewById(R.id.m50);
                    o.LJIIIIZZ(handleGroupBanned$lambda$4, "handleGroupBanned$lambda$4");
                    handleGroupBanned$lambda$4.setVisibility(0);
                    handleGroupBanned$lambda$4.setText(str);
                    ((TextView) _$_findCachedViewById(R.id.lyv)).setText(getContext().getString(R.string.gxm));
                    InterfaceC84293Sn interfaceC84293Sn2 = this.LJLJI;
                    if (interfaceC84293Sn2 instanceof C3O4) {
                        String conversationId2 = c63120Opw.getConversationId();
                        o.LJIIIIZZ(conversationId2, "conversation.conversationId");
                        C3WM.LIZIZ(conversationId2, C3WP.LIZIZ);
                        return;
                    } else {
                        if (!o.LJ(interfaceC84293Sn2, C3NB.LIZ)) {
                            return;
                        }
                        String conversationId3 = c63120Opw.getConversationId();
                        o.LJIIIIZZ(conversationId3, "conversation.conversationId");
                        C3WM.LIZIZ(conversationId3, C3WO.LIZIZ);
                        return;
                    }
                }
            }
        }
        this.LJLJI = C84313Sp.LIZ;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        LJJLJLI(i);
        super.setVisibility(i);
    }

    public final void LJJLL(C63120Opw c63120Opw, InterfaceC88472Yns<? super C63120Opw, C76800UCe> onAction) {
        o.LJIIIZ(onAction, "onAction");
        if (c63120Opw == null) {
            return;
        }
        LJJLJLI(0);
        TextView textView = (TextView) _$_findCachedViewById(R.id.m50);
        textView.setVisibility(0);
        textView.setText("");
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.lyv);
        textView2.setText(textView2.getContext().getString(R.string.gv4));
        this.LJLJI = C84313Sp.LIZ;
        LJJZZI(c63120Opw);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.lyv), new ACListenerS36S0200000_1(c63120Opw, onAction, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3WL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = new C3WQ();
        LJJLJLI(getVisibility());
        this.LJLJI = C84313Sp.LIZ;
    }

    public /* synthetic */ C3WL(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
