package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.07e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ActionModeCallbackC023007e implements ActionMode.Callback {
    public final ActionMode.Callback LJLIL;
    public final TextView LJLILLLLZI;
    public Class<?> LJLJI;
    public Method LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.LJLIL.onDestroyActionMode(actionMode);
    }

    public ActionModeCallbackC023007e(ActionMode.Callback callback, TextView textView) {
        this.LJLIL = callback;
        this.LJLILLLLZI = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.LJLIL.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.LJLIL.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        List<ResolveInfo> queryIntentActivities;
        int i;
        boolean z;
        Context context = this.LJLILLLLZI.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.LJLJI = cls;
                this.LJLJJI = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.LJLJJL = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.LJLJI = null;
                this.LJLJJI = null;
                this.LJLJJL = false;
            }
        }
        try {
            if (this.LJLJJL && this.LJLJI.isInstance(menu)) {
                declaredMethod = this.LJLJJI;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{type, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "1227607262900956757"));
                if (LIZJ.LIZ) {
                    queryIntentActivities = (List) LIZJ.LIZIZ;
                } else {
                    queryIntentActivities = packageManager.queryIntentActivities(type, 0);
                }
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) ListProtector.get(arrayList, i2);
                MenuItem add = menu.add(0, 0, i2 + 100, resolveInfo2.loadLabel(packageManager));
                TextView textView = this.LJLILLLLZI;
                Intent type2 = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                    i = 1;
                    z = true;
                } else {
                    i = 1;
                    z = false;
                }
                Intent putExtra = type2.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z);
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(i);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.LJLIL.onPrepareActionMode(actionMode, menu);
    }
}
